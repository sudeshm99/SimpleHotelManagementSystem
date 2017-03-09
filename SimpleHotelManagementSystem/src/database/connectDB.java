
package database;

import java.sql.*;

public class connectDB {
    public Connection conn = null;
    public void connect(){
        String url = "jdbc:mysql://localhost:3306/HotelManagementSystem?useSSL=false";
        String user = "root";
        String pass = "1234";
        
        try{
            conn = DriverManager.getConnection(url, user, pass);
            if(conn != null){
                System.out.println("Connected to database");
            }
        }catch(Exception ex){
            System.out.println("Maybe username or password is incorrent");
            ex.printStackTrace();
        }
    }
}
