/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafram.livraria.testes;

import br.com.fafram.livraria.db.ConnectionFactory;
import br.com.fafram.livraria.produtos.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author MuriloScapim
 */
public class RepositorioDeProdutos {
    
    public void adiciona(Produto produto) {
        PreparedStatement ps;
        
        try (Connection conn =
                new ConnectionFactory().getConnection()) {
            ps = conn.prepareStatement("insert into produtos"
                    + "(nome, descricao, valor, isbn) values (?,?,?,?)");
                        
            ps.setString(1, produto.getNome());
            ps.setString(2, produto.getDescricao());
            ps.setDouble(3, produto.getValor());
            ps.setString(4, produto.getIsbn());
                        
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    } 
}
