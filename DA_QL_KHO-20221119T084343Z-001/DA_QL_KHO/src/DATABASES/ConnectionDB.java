package DATABASES;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
/**
 *
 * @author NT
 */
public class ConnectionDB {
   
        
    
    private static String url = "jdbc:sqlserver://localhost:1433;database=DoAn_QLKho";
    private static String user = "sa";
    private static String pass = "12345678";
   
    public static Connection conn;

    // xu ly ngoai le khi tuong tac voi csdl 


    public void displayError(SQLException ex) {
        System.out.println(" Error Message:" + ex.getMessage());
        System.out.println(" SQL State:" + ex.getSQLState());
        System.out.println(" Error Code:" + ex.getErrorCode());
    }
    public ConnectionDB() {// mo ket noi den csdl 
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url, user, pass);//tao ket noi den co so du lieu 
            System.out.println("Ket noi thanh cong");
        } catch (SQLException ex) {// xu ly ngoai le 
            displayError(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Thieu JDBC");
        }
    }
    public void close() {// dong ket noi co so du lieu 
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            displayError(ex);
        }
    }
    //tao va thuc thi cac cau lenh sql 
     public static ResultSet excuteQuery(String sql) {// danh cho cau lenh select 
        
        try {
            Statement stm = conn.createStatement();
            

            return stm.executeQuery(sql);

        } catch (SQLException ex) {
            System.out.println(" Error Message:" + ex.getMessage());
            System.out.println(" SQL State:" + ex.getSQLState());
            System.out.println(" Error Code:" + ex.getErrorCode());;
        }
        return null;
    }
    
    
    
    // cung cap thong tin trich rut tu csdl va cho phep truy xuat tung dong du lieu 
}
   