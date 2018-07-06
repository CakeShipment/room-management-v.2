package roommanagement;
import Connection.DBConnect;
import UI.Login;
import java.sql.*;

public class RoomManagement {

   public static void main(String[] args){
        ResultSet rs = null;
        
        rs = DBConnect.getResultSet("SELECT * FROM user");
        //so instead of having to declare variables for every class, we just need to
        //call the static method DBConnect.getResultSet(String query);
        
        try{//try catch because needed
            while(rs.next()){
                System.out.printf("%s\n", rs.getString(2));
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
       
        new Login().open();
   }
    
}