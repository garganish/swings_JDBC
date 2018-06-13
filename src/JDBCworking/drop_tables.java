/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCworking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author anishgarg
 */
public class drop_tables {
    public static void main(String[] args) {
        Connection con=null;
       
        
        try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
            String db_url="jdbc:mysql://192.168.64.2:3306/anish_working1";
            String db_user="";
            String db_pwd="";

            con=DriverManager.getConnection(db_url, db_user, db_pwd);
            
            //String query="drop table t1";
            String query="drop table if exists t1";
            Statement smt=con.createStatement();
            smt.execute(query);
            SQLWarning war=smt.getWarnings();
            if(war!=null)
            {
                System.out.println(war);
            }
            
            smt.close();
            
           
        }catch(ClassNotFoundException | SQLException ex)
        {
            System.out.println(ex);
        }
          finally
        {
            try
            {
                if(con!=null)
                {
                con.close();
                }
            }catch(SQLException ex)
            {
                
            }
            
        }
    }
}
