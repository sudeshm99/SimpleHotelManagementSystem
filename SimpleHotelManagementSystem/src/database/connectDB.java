
package database;

import java.sql.*;

public class connectDB {
    public Connection conn = null;
    public void connectDB(){
        String url = "jdbc:mysql://localhost:3306/HotelManagmentSystem";
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
