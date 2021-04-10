package utilities;

import org.testng.annotations.Test;

public class DemoExcel {

    @Test(dataProvider = "getexcelData", dataProviderClass = TestDataProvider.class)
    public void testexceldata(String uname, String pass){
        System.out.println("User name is "+uname);
        System.out.println("Password is "+pass);

    }



}
