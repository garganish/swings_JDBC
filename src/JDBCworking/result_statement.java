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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class result_statement {
    public static void main(String[] args) {
        Connection cc=null;
        try
        {
           
             Class.forName("com.mysql.jdbc.Driver");
            String db_url="jdbc:mysql://192.168.64.2:3306/anish_working1";
            String db_user="";
            String db_pwd="";
            cc=DriverManager.getConnection(db_url, db_user, db_pwd);
            String query="select courseid,coursename,coursefee";
            query+=" from courses";
            Statement smt=cc.createStatement();
            //PreparedStatement smt=cc.prepareStatement(query);
            ResultSet res=smt.executeQuery(query);
            ResultSetMetaData meta=res.getMetaData();
            for(int i=1;i<=meta.getColumnCount();i++)
            {
                System.out.println(meta.getColumnName(i) +"\t");
            }
            System.out.println(" ");
            if(res.next())
            {
                do
                {
                  System.out.println(res.getString(1)+"\t\t"+res.getString("coursename")+"\t\t\t\t"+res.getString(3));
 
                }while(res.next());
            
            }
            else
            {
                System.out.println("there is no record present");  
            }
            res.close();
           smt.close();
           
        }catch(ClassNotFoundException | SQLException ex)
        {
            System.out.println(ex); 
        }
        finally
        {
            try
            {
                if(cc!=null)
                {
                    cc.close();
                }
            }catch(SQLException ex)
            {
                System.out.println(ex);
            }
        }
    }
    
}
