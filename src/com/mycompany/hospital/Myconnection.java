/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hospital;
import java.sql.*;
/**
 *
 * @author Ashray
 */
public class Myconnection {
    public static void main(String[] args) throws Exception
    {
        String url="jdbc:mysql://localhost:3306/data";
        String uname="root";
        String pass="root";
        String query="";
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection(url,uname,pass);
        Statement st=con.createStatement();
        st.executeQuery(query);
        ResultSet rs=st.executeQuery(query);
        String name=rs.getString(query);
        
        System.out.println();
                
                
        
        rs.next();
        
        
        st.close();
        con.close();
        
        
    }
}
