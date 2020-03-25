package com.neofect.gts.rest.common;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor.HSSFColorPredefined;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/excel")
public class ExcelDownResource {
	

	@ApiOperation(value = "엑셀 다운로드" ,notes = "이것은 엑셀 다운로드를 불러온다.")
	@ApiImplicitParams({
        @ApiImplicitParam(name = "testData1", value = "테스트 데이터1", required = true, dataType = "string", paramType = "query", defaultValue = ""),
   })
	@GetMapping(value = "/down", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> CurrentAccountsReceivable(@RequestParam(required = false) Map<String, Object> q
    														, HttpServletRequest request,
    														HttpServletResponse response) throws IOException, ParseException {
        if (q == null) {
            q = new HashMap<String,Object>();
        }
		
		Workbook wb = new HSSFWorkbook();
		Sheet sheet = wb.createSheet("수급자_청구_현황_");
		
		sheet.setColumnWidth(0, 3500);
		sheet.setColumnWidth(1, 3500);
		sheet.setColumnWidth(2, 3500);
		sheet.setColumnWidth(3, 3500);
		sheet.setColumnWidth(4, 3500);
		sheet.setColumnWidth(5, 3500);
		sheet.setColumnWidth(6, 3500);
		sheet.setColumnWidth(7, 3500);
		sheet.setColumnWidth(8, 4000);
		
		Row row = null;
		Cell cell = null;
		
		int rowNo = 0;
		
		// 다운로드할 데이터의 VO 생성
		List<String> list = new ArrayList<>();
		for(int i = 0; i <= 5; i++) {
			list.add("테스트데이터" + i);
		}
		
	    // 테이블 헤더용 스타일
	    CellStyle headStyle = wb.createCellStyle();

	    // 가는 경계선
	    headStyle.setBorderTop(BorderStyle.THIN);
	    headStyle.setBorderBottom(BorderStyle.THIN);
	    headStyle.setBorderLeft(BorderStyle.THIN);
	    headStyle.setBorderRight(BorderStyle.THIN);

	    // 배경색
	    headStyle.setFillForegroundColor(HSSFColorPredefined.CORAL.getIndex());
	    headStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

	    // 데이터는 가운데 정렬
	    headStyle.setAlignment(HorizontalAlignment.CENTER);

	    // 데이터용 경계 스타일 테두리만 지정
	    CellStyle bodyStyle = wb.createCellStyle();
	    
	    bodyStyle.setAlignment(HorizontalAlignment.CENTER);
	    bodyStyle.setBorderTop(BorderStyle.THIN);
	    bodyStyle.setBorderBottom(BorderStyle.THIN);
	    bodyStyle.setBorderLeft(BorderStyle.THIN);
	    bodyStyle.setBorderRight(BorderStyle.THIN);

	    CellStyle mergeRowStyle = wb.createCellStyle();
	    mergeRowStyle.setAlignment(HorizontalAlignment.CENTER);
	    mergeRowStyle.setVerticalAlignment(VerticalAlignment.CENTER);

	    Font mergeFont = wb.createFont();
	    mergeFont.setBold(true);
	    mergeRowStyle.setFont(mergeFont);
	    headStyle.setFont(mergeFont);


        // 헤더 생성
	    row = sheet.createRow(rowNo++);
	    
	    cell = row.createCell(0);
	    cell.setCellStyle(headStyle);
	    cell.setCellValue("센터");
	    
	    cell = row.createCell(1);
	    cell.setCellStyle(headStyle);
	    cell.setCellValue("수급자명");
	    
	    cell = row.createCell(2);
	    cell.setCellStyle(headStyle);
	    cell.setCellValue("생일");
	    
	    cell = row.createCell(3);
	    cell.setCellStyle(headStyle);
	    cell.setCellValue("요양등급");
	    
	    cell = row.createCell(4);
	    cell.setCellStyle(headStyle);
	    cell.setCellValue("공단청구금(A)");
	    
	    cell = row.createCell(5);
	    cell.setCellStyle(headStyle);
	    cell.setCellValue("본인부담금(B)");
	    
	    cell = row.createCell(6);
	    cell.setCellStyle(headStyle);
	    cell.setCellValue("총수가(A+B)");
	    
	    cell = row.createCell(7);
	    cell.setCellStyle(headStyle);
	    cell.setCellValue("비급여(D)");
	    
	    cell = row.createCell(8);
	    cell.setCellStyle(headStyle);
	    cell.setCellValue("총수납금액(B+D)");
	  
	    
	    // 데이터 부분 생성                    
	    for(int i = 0; i < list.size(); i++) {
	    	
	    	row = sheet.createRow(rowNo++);
	    	cell = row.createCell(0);
	    	cell.setCellStyle(bodyStyle);
	    	cell.setCellValue(list.get(i));
	    	
	    	cell = row.createCell(1);
	    	cell.setCellStyle(bodyStyle);
	    	cell.setCellValue(list.get(i));	
	    	
	    	cell = row.createCell(2);
	    	cell.setCellStyle(bodyStyle);
	    	cell.setCellValue(list.get(i));
	    	
	    	cell = row.createCell(3);
	    	cell.setCellStyle(bodyStyle);
	    	cell.setCellValue(list.get(i));
	    	
	    	cell = row.createCell(4);
	    	cell.setCellStyle(bodyStyle);
	    	cell.setCellValue(list.get(i));
	    	
	    	cell = row.createCell(5);
	    	cell.setCellStyle(bodyStyle);
	    	cell.setCellValue(list.get(i));
	    	
	    	cell = row.createCell(6);
	    	cell.setCellStyle(bodyStyle);
	    	cell.setCellValue(list.get(i));
	    	
	    	cell = row.createCell(7);
	    	cell.setCellStyle(bodyStyle);
	    	cell.setCellValue(list.get(i));
	    	
	    	cell = row.createCell(8);
	    	cell.setCellStyle(bodyStyle);
	    	cell.setCellValue(list.get(i));
	    	
	    }
	      
	    

	    // 컨텐츠 타입과 파일명 지정
	    response.setContentType("ms-vnd/excel");
	    response.setHeader("Content-Disposition", "attachment;filename=수급자청구현황.xls");

	    // 엑셀 출력
	    wb.write(response.getOutputStream());
	    wb.close();
        
        
        return new ResponseEntity<>(HttpStatus.OK);
    }

	
}