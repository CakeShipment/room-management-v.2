/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roommanagement;


import java.sql.*;

/**
 *
 * @author Cake
 */
public class RoomManagement {

    static final String DB_URL =
      "jdbc:mysql://localhost/room_management?useUnicode=true&useJDBCCompliantTimeZoneShift=true&useLegacyDaytimeCode=false&serverTimezone=UTC";
   static final String DB_DRV =
      "com.mysql.jdbc.Driver";
   static final String DB_USER = "root";
   static final String DB_PASSWD = "";

   public static void main(String[] args){

      Connection connection = null;
      Statement statement = null;
      ResultSet resultSet = null;

      try{
         connection=DriverManager.getConnection
            (DB_URL,DB_USER,DB_PASSWD);
         statement=connection.createStatement();
         resultSet=statement.executeQuery
            ("SELECT * FROM user");
         while(resultSet.next()){
            System.out.printf("%s\n",
            resultSet.getString(2));
         }

      }catch(SQLException ex){
          System.out.println(ex);
      }
   }
    
}
