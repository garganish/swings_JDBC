/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCworking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author anishgarg
 */
public class valid_users {
    public static void main(String[] args) {
         Connection con=null;
        Scanner sc=new Scanner(System.in);
        String uname,upass;
        
        try
        {
            System.out.println("enter the username");
            uname=sc.nextLine();
            System.out.println("enter the password");
            upass=sc.nextLine();
            Class.forName("com.mysql.jdbc.Driver");
            String db_url="jdbc:mysql://192.168.64.2:3306/anish_working1";
            String db_user="";
            String db_pwd="";

            con=DriverManager.getConnection(db_url, db_user, db_pwd);
            String query="select * ";
            query+=" from logins";
            query+=" where username='"+uname+"' and password='"+upass+"'";
            System.out.println(query);
            Statement smt=con.createStatement();
            //it gives valid user when we do 
            // USERNAME= x;
            //password=  x' or '1'='1
            // as the value of the password is alwaus TRUE. this is sql injection so remove it we use prepared statements
            //this is because in the sql there is a special meaning of the single quotes i.e ('). cause of this it act like a string
            //as everything which is written in the ('') whill act as the satring in the mysql
            // in the prepared statement the ('') acts like a VALUE NOT AS STRING.
            ResultSet rs=smt.executeQuery(query);
            
            if(rs.next())
            {
                System.out.println("valid user");
            
            }
            else
            {
                System.out.println("invalid user");
            }
            rs.close();
            
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
