package Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBpull {
    
    public static ResultSet pull(String query){
        DBConnect db = new DBConnect();
        Statement statement = db.getStatement();
        ResultSet resultSet = null;

        if(statement != null){
            try{
                resultSet = statement.executeQuery(query);
                System.out.println("[" + query + "] query successful");
            }catch(SQLException ex){
                System.out.println(ex);
            }
        }
        return resultSet;
    }
        
}
