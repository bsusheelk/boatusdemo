package boatus.util;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testUtil {
	public static String excelpath="C:\\Users\\sushe\\Desktop\\BoatTestData.xlsx";
	public static XSSFWorkbook bk;

	

	public static  Object[][]  homepagebtestdata(String Sheetname) throws IOException{
		
		FileInputStream file=null;
		try {
			file=new FileInputStream(excelpath);
			
		}
	catch(Exception e) {
		System.out.println(e);
	}

	bk=new XSSFWorkbook(file);
	XSSFSheet sheet=bk.getSheet(Sheetname);
	
	Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	
	for(int i=0;i<sheet.getLastRowNum();i++) {
		for(int k=0;k<sheet.getRow(0).getLastCellNum();k++) {
			data[i][k]=sheet.getRow(i+1).getCell(k).toString();
		}
	}
	

return data;


}}