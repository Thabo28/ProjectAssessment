package Library;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadingConf {

	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public ExcelReadingConf(String excelPath)
	{
		try {
			File src = new File("C:\\Data\\TestData.xlsx");
			
			FileInputStream fis = new FileInputStream(src);
			
			 wb = new XSSFWorkbook(fis);

			 
		} catch (Exception e) {
			
			System.out.print(e.getMessage());
		}
	}
	
	public String GetData(int sheetNumber, int rowNumber)
	{
		sheet1 = wb.getSheetAt(0);
		String data = sheet1.getRow(rowNumber).getCell(0).getStringCellValue();
		return data;
	}
}
