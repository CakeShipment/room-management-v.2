package roommanagement;
import UI.Login;
import Connection.DBConnect;

import java.sql.*;

public class RoomManagement {

   public static void main(String[] args){
        DBConnect db = new DBConnect();
        Statement statement = db.getStatement();
        ResultSet resultSet = null;

        if(statement != null){
            try{
                resultSet=statement.executeQuery("SELECT * FROM user");
                while(resultSet.next()){
                    System.out.printf("%s\n", resultSet.getString(2));
                }
            }catch(SQLException ex){
                System.out.println(ex);
            }
        }
        new Login().open();
   }
    
}