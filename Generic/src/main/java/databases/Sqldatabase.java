package databases;

import java.sql.*;

public class Sqldatabase {

    public String connectDatab(String tablename,String columnforRow,String columnvalue,String columnLabel) {

        String url = "jdbc:mysql://localhost:3306/mamun?serverTimezone=UTC";
        String user = "root";

        String password = "root12345";

        Connection connection = null;
        Statement statement = null;
        ResultSet rs;
        String sqldata = null;


        //need to parameterized
        String query = "select * from movie where id  = 101 ";
        String query1 = "select * from "+ tablename +" where " + columnforRow +"  = "+columnvalue+" ";

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            rs = statement.executeQuery(query1);


            while (rs.next()) {

                sqldata = rs.getString(columnLabel);
            }
        } catch (SQLException e) {

            e.printStackTrace();
        } finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException sq) {

            }

        }

        return sqldata;

    }
}
