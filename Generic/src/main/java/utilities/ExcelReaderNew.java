package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderNew {
	
	public Object [][] getExcelData(String sheetName)
	{
		System.out.println("****Generating Test Data****");
		
		XSSFWorkbook wb = null;
		try 
		{
			wb = new XSSFWorkbook(new FileInputStream(new File(System.getProperty("user.dir")+"/TestData/Data.xlsx")));

		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.println("*******test");
		int rowcount=wb.getSheet(sheetName).getPhysicalNumberOfRows();
		System.out.println(rowcount);
		
		int column=wb.getSheet(sheetName).getRow(0).getPhysicalNumberOfCells();

		System.out.println(column);
		
		Object [][]arr=new Object[rowcount][column];
		
		for(int i=0;i<rowcount;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=wb.getSheet(sheetName).getRow(i).getCell(j).getStringCellValue();
			}
		}
		System.out.println("****Test Data Generated****");

		return arr;

	}
	public static void main(String[] args) {
		ExcelReaderNew exl = new ExcelReaderNew();
		Object[][] obj = exl.getExcelData("User");

		for (Object[] ob : obj) {
			for(Object o : ob){
				String data =o.toString();
				System.out.println(data);
			}

		}
	}
	

}
