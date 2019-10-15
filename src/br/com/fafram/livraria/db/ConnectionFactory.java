/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafram.livraria.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author MuriloScapim
 */
public class ConnectionFactory {
    
    public Connection getConnection() {
        String url = "jdbc:postgresql://localhost:5437/livraria";
        try {
            return DriverManager.getConnection(url, "postgres",
                    "123456");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void main(String[] args) {
        Connection conn = new ConnectionFactory().getConnection();
        System.out.println("Conectado ao banco");
    }
}
