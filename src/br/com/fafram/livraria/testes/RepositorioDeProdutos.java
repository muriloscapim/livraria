/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafram.livraria.testes;

import br.com.fafram.livraria.Autor;
import br.com.fafram.livraria.db.ConnectionFactory;
import br.com.fafram.livraria.produtos.LivroFisico;
import br.com.fafram.livraria.produtos.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    
    public List<Produto> lista() {
        List<Produto> produtos = new ArrayList<Produto>();
                
        PreparedStatement ps;
        try (Connection conn =
                new ConnectionFactory().getConnection()) {
            ps = conn.prepareStatement("select * from produtos");
            ResultSet resultSet = ps.executeQuery();
            
            while(resultSet.next()) {
                LivroFisico livro =
                        new LivroFisico(new Autor());
                livro.setId(resultSet.getInt("id_produto"));
                livro.setNome(resultSet.getString("nome"));
                livro.setDescricao(resultSet.getString("descricao"));
                livro.setValor(resultSet.getDouble("valor"));
                livro.setIsbn(resultSet.getString("isbn"));
                produtos.add(livro);
            }
            
            resultSet.close();
            ps.close(); 
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return produtos;
    }  
}
