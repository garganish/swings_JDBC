/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCworking;

import java.sql.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author anishgarg
 */
public class demo1 {
    public static void main(String[] args){
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String db_url="jdbc:mysql://192.168.64.2:3306/anish_working";
            String username="";
            String password="";
            Connection cc;
            cc =  DriverManager.getConnection(db_url, username, password);
            DatabaseMetaData meta=cc.getMetaData();
            System.out.println(meta.getDriverName());
            cc.close();
            
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            System.out.println(ex);
        }
        
        
    }
}
