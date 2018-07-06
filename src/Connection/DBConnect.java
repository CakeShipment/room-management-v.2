package Connection;
import java.sql.*;

public class DBConnect {
    static final String DB_URL = "jdbc:mysql://localhost/room_management?useUnicode=true&useJDBCCompliantTimeZoneShift=true&useLegacyDaytimeCode=false&serverTimezone=UTC";
    static final String DB_USER = "root";
    static final String DB_PASSWD = "";
    
    private static Connection getConnection(){
        Connection connection = null;
        try{
            connection=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
        } catch(SQLException ex){
            System.out.println(ex);
        }
        return connection;
    }
    
    private static Statement getStatement(){
        Statement statement = null;
        try{
            statement = getConnection().createStatement();
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return statement;
    }
    
    public static ResultSet getResultSet(String query){
        ResultSet resultSet = null;
        try{
            resultSet = getStatement().executeQuery(query);
            System.out.println("[" + query + "] query successful");
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return resultSet;
    }
}