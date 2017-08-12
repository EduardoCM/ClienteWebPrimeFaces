package com.netect.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConeccionDao {
    
    private Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public void Conectar(){
        String url = "jdbc:derby://localhost:1527/ClienteDB";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        String userName = "root";
        String password = "root";
        
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url, userName, password);
            System.out.println("Conexion exitosa");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
    public void cerrrar(){
        try {
            if(con != null && !con.isClosed()){
                con.close();
            }
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
    }
}
