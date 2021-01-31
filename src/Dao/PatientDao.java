/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import DBConn.Myconnection;
import POJO.PatientPojo;
import java.sql.Connection;
import java.util.logging.Level;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Logger;

/**
 *
 * @author Ashray
 */
public class PatientDao {
    
    public static boolean addPatient (PatientPojo obj)
    {
        boolean status=true;
        Connection conn;
        PreparedStatement ps;
        ResultSet rs;
        try 
        {
            conn = (Connection) Myconnection.getConnection();
            ps=conn.prepareStatement("select * from patient where p_name = ?");
            ps.setString(1, obj.getP_name());
            rs=ps.executeQuery();
            if(rs.next())
            {
                status=false;
            }
            else
            {
                ps=conn.prepareStatement("insert into patient values(?,?,?,?,?)");
                ps.setString(1, obj.getP_name());
                ps.setString(2, obj.getF_name());
                ps.setInt(3, obj.getAge());
                ps.setLong(4,obj.getAadhar());
                ps.setString(5, obj.getDoc_name());
                ps.executeUpdate();
            }
        } 
        catch (Exception ex) {
            Logger.getLogger(PatientDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
}
