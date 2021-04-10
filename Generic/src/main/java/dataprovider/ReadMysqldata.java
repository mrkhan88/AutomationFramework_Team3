package dataprovider;

import databases.ConnectMysql;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class ReadMysqldata {

    @DataProvider(name = "mysqldata")
    public Object [][] getData() throws SQLException, ClassNotFoundException {
        ConnectMysql conmsql = new ConnectMysql();
        Object data[][] = conmsql.getMysqlData("mamun.bofadata");
        return data;
    }

    @DataProvider(name = "mysqldata2")
    public Object [][] getData2() throws SQLException, ClassNotFoundException {
        ConnectMysql conmsql = new ConnectMysql();
        Object data[][] = conmsql.getMysqlData("mamun.signin");
        return data;
    }

   /* @Test(dataProvider = "mysqldata")
    public void testdata(String un, String psw){
        System.out.println(un);
        System.out.println(psw);
    }*/


}
