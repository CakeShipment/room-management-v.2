package Connection;
import java.sql.*;

public class DBConnect {
    static final String DB_URL = "jdbc:mysql://localhost/room_management?useUnicode=true&useJDBCCompliantTimeZoneShift=true&useLegacyDaytimeCode=false&serverTimezone=UTC";
    static final String DB_USER = "root";
    static final String DB_PASSWD = "";
    
    public Statement getStatement(){
        Connection connection = null;
        Statement statement = null;
        try{
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
            statement = connection.createStatement();
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return statement;
    }
}
