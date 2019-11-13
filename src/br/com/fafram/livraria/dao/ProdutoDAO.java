/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafram.livraria.dao;

import br.com.fafram.livraria.modelo.Autor;
import br.com.fafram.livraria.db.ConnectionFactory;
import br.com.fafram.livraria.modelo.produtos.LivroFisico;
import br.com.fafram.livraria.modelo.produtos.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Cuida do acesso aos dados da classe {@link Produto}
 * @author MuriloScapim
 */
public class ProdutoDAO {
    
    /**
     * Realiza a inserção do produto no banco de dados
     * @param produto que deverá ser adicionado no banco
     * @throws RuntimeException em caso de erros
     */
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
    
    /**
     * Lista todos os produtos do banco de dados
     * @return {@link List} com todos os produtos
     * @throws RuntimeException em caso de erros
     */
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
    
    /**
     * Altera um produto salvo no banco de dados
     * @param produto que deverá ser atualizado no banco
     */
    public void altera(Produto produto) {
        PreparedStatement ps;
        
        try (Connection conn =
                new ConnectionFactory().getConnection()) {
            ps = conn.prepareStatement("update produtos set nome=?,"
                    + "descricao=? valor=?, isbn=? where id_produto=?");
            
            ps.setString(1, produto.getNome());
            ps.setString(2, produto.getDescricao());
            ps.setDouble(3, produto.getValor());
            ps.setString(4, produto.getIsbn());
            ps.setInt(5, produto.getId());
            
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Remove um produto salvo no banco de dados
     * @param produto que deverá ser removido
     */
    public void remove(Produto produto) {
        PreparedStatement ps;
        
        try (Connection conn =
                new ConnectionFactory().getConnection()) {
            ps = conn.prepareStatement("delete from produtos"
                    + "where id_produto=?");
            
            ps.setInt(1, produto.getId());
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
