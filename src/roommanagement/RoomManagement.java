package roommanagement;
import UI.Login;

import java.sql.*;

/**
 *
 * @author Cake
 */
public class RoomManagement {

    static final String DB_URL = "jdbc:mysql://localhost/room_management?useUnicode=true&useJDBCCompliantTimeZoneShift=true&useLegacyDaytimeCode=false&serverTimezone=UTC";
    static final String DB_DRV = "com.mysql.jdbc.Driver";
    static final String DB_USER = "root";
    static final String DB_PASSWD = "";

    public static void main(String[] args){

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{
           connection=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);//establishing connection??

           statement=connection.createStatement();//establishing connection??

           resultSet=statement.executeQuery("SELECT * FROM user");//query code

            while(resultSet.next()){
               System.out.printf("%s\n", resultSet.getString(2)); //printing the name
            }

        }catch(SQLException ex){
            System.out.println(ex);
        }
        new Login().open();
    }
    
}
