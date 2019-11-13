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
 * Classe responsável por fazer as devidas conexões de acesso
 * ao banco de dados
 * @author MuriloScapim
 */
public class ConnectionFactory {
    
    /**
     * Realiza a abertura de conexão com o banco de dados
     * @return {@link Connection} com a conexão aberta
     */
    public Connection getConnection() {
        String url = "jdbc:postgresql://localhost:5432/livraria";
        try {
            return DriverManager.getConnection(url, "postgres",
                    "7654321");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
