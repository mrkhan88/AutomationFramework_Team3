package databases;

import java.sql.*;

public class ConnectMysql {

    public Object[ ][ ] getMysqlData(String tablename) throws ClassNotFoundException, SQLException {
        System.out.println("****Generating Test Data****");

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/mamun?serverTimezone=UTC";
        String user = "root";
        String password = "root12345";

        String query2 = "select * from mamun.bofadata";
        String query1 = "select * from "+tablename+"";

        Connection connection = DriverManager.getConnection(url, user, password);

        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        ResultSet rs = statement.executeQuery(query1);

        rs.last();

        int rows = rs.getRow();
        System.out.println("Number of Rows"+rows);

        ResultSetMetaData rsmd = rs.getMetaData();

        int columncount = rsmd.getColumnCount();
        System.out.println("number of Columns "+columncount);

        Object data[][] = new String [rows][columncount];

        int i =0;
        rs.beforeFirst();
        while (rs.next()) {

            for(int j=0; j<columncount; j++) {
                data[i][j]=rs.getString(j+1);
            }
            i++;

        }

        connection.close();
        statement.close();

        return data;
    }

}
