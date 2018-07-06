/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;


import java.sql.*;

/**
 *
 * @author Cake
 */
public class DBConnect {
    static final String DB_URL =
      "jdbc:mysql://localhost/room_management?useUnicode=true&useJDBCCompliantTimeZoneShift=true&useLegacyDaytimeCode=false&serverTimezone=UTC";
    static final String DB_USER = "root";
    static final String DB_PASSWD = "";
    
    public Statement getStatement(){
        Connection connection = null;
        Statement statement = null;
        try{
            connection=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
            statement=connection.createStatement();
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return statement;
    }
}
