package generics;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

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
}
