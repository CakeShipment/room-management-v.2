package Entities;

public class Admin {
    private int userID;
    private String realName;
    private String username;
    private String password;
    private String createdDate;
    private String updatedDate;
    
    public Admin(int id, String rname, String uname, String pass, String cdate, String uDate){
        this.userID = id;
        this.realName = rname;
        this.username = uname;
        this.password = pass;
        this.createdDate = cdate;
        this.updatedDate = uDate;
    }
    
    public String getAdminName(){
        return this.realName;
    }
    public int getAdminID(){
        return this.userID;
    }
    public String getPass(){
        return this.password;
    }
}
