package com.neofect.gts.config;
import java.util.ArrayList;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMethod;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * SWAGGER 설정 파일
 * @author jd
 * 
 * 접속 시
 * /swagger-ui.html
 *
 */
@Configuration
@EnableSwagger2WebMvc
@Import(SpringDataRestConfiguration.class)
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2) 
          .select()                                 
          .apis(RequestHandlerSelectors.basePackage("com.neofect.gts.rest") )             
          .paths(PathSelectors.any())
          .build()
          .apiInfo(apiInfo())
          .useDefaultResponseMessages(false)                                  
          .globalResponseMessage(RequestMethod.GET, getArrayList());
         
    }
     
    private ArrayList<ResponseMessage> getArrayList(){
        ArrayList<ResponseMessage> lists = new ArrayList<ResponseMessage>();
         
        lists.add(new ResponseMessageBuilder()
                .code(500)
                .message("Internal Server Error")
                .responseModel(new ModelRef("Error"))
                .build());
        
        lists.add(new ResponseMessageBuilder()
                .code(400)
                .message("Bad Request")
                .build());
        
        lists.add(new ResponseMessageBuilder()
                .code(404)
                .message("Not Found")
                .build());
         
        return lists;
    }
    
    private ApiInfo apiInfo() {
        return new ApiInfo(
          "GreenCare REST API", 
          "Description of API.", 
          "API TOS", 
          "Terms of service", 
          new Contact("", "www.neofect.com", "help@neofect.com"), 
          "License of API", "API license URL", Collections.emptyList());
    }
}
