/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCworking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author anishgarg
 */
public class prepared_statements {
    
    public static void main(String[] args) {
        Connection cc=null;
    Scanner sc=new Scanner(System.in);
        String cid,cname;
        int cfee;
        try
        {
            System.out.println("enter the courseid");
            cid=sc.nextLine();
            System.out.println("enter the coursename");
            cname=sc.nextLine();
            System.out.println("enter the coursefee");
            cfee=sc.nextInt();
             Class.forName("com.mysql.jdbc.Driver");
            String db_url="jdbc:mysql://192.168.64.2:3306/anish_working1";
            String db_user="";
            String db_pwd="";
            cc=DriverManager.getConnection(db_url, db_user, db_pwd);
            String query="insert into courses";
            query+="(courseid,coursename,coursefee)";
            query+=""+"values(?,?,?)";
           
            PreparedStatement smt=cc.prepareStatement(query);
            smt.setString(1, cid);
            smt.setString(2, cname);
            smt.setInt(3, cfee);
           boolean res=smt.executeUpdate()>0;
           smt.close();
            if(res)
            {
                System.out.println("insertion has been done");
            }
            else
            {
                System.out.println("something went wrong");
            }
            
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
