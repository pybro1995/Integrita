package generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class FWUtils {
	
	public static String getXLData(String path,String sheet,int row,int cell)
	{
		String s="";
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			s=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return s; 
	}
	
	public static void writeXLData(String path,String sheet,int row,int cell,String value)
	{
		
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			Cell c=wb.getSheet(sheet).createRow(row).createCell(cell);
			
			c.setCellValue(value); 
			wb.write(new FileOutputStream(path));
			
		}
		catch (Exception e) {
			
		}
	}
	
	public static void takeScreenshot(WebDriver driver,String pname) throws IOException {
		String x="./scrnshots/"+pname+".png";
		TakesScreenshot ts = (TakesScreenshot) driver;
		 
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 File des = new File(x);
		 FileUtils.copyFile(src, des);
		 
		
	}
}
