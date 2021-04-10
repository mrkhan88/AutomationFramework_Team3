package utilities;

import org.testng.annotations.DataProvider;

public class TestDataProvider 
{
		
	@DataProvider(name="getexcelData")
	public Object [][] getDataNew()
	{
		ExcelReaderNew exr = new ExcelReaderNew();
		return exr.getExcelData("User");
	
	}

}
