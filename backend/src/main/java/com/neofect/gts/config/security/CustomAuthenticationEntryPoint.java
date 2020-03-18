package com.neofect.gts.config.security;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;

import lombok.extern.slf4j.Slf4j;

/**
 * @author jd
 * 인증된 사용자가 SecurityContext에 존재하지도 않고, 어떠한 인증되지 않은 익명의 사용자가 보호된 리소스에 접근 시 처리 됨
 * LoginUrlAuthenticationEntryPoint를 상속한 CustomAuthenticationEntryPoint 등록
 */
@Slf4j
public class CustomAuthenticationEntryPoint extends LoginUrlAuthenticationEntryPoint{

	public CustomAuthenticationEntryPoint(String loginFormUrl) {
		super(loginFormUrl);
	}

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {
		
		log.debug("===============CustomAuthenticationEntryPoint.commence===============");
		
		response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		super.commence(request, response, authException);
	}
	
}