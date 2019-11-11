/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafram.livraria.testes;

import br.com.fafram.livraria.dao.ProdutoDAO;
import br.com.fafram.livraria.modelo.Autor;
import br.com.fafram.livraria.modelo.produtos.LivroFisico;
import br.com.fafram.livraria.modelo.produtos.Produto;
import java.util.List;

/**
 *
 * @author MuriloScapim
 */
public class CadastroDeProdutos {
    
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Mauricio");
        
        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test Driven Development");
        fisico.setDescricao("Livro sobre testes");
        fisico.setValor(59.90);
        fisico.setIsbn("123-45-678-9123-4");
        fisico.setId(1);
        
        ProdutoDAO dao = new ProdutoDAO();
        dao.adiciona(fisico);
        
        dao.altera(fisico);
        
        dao.remove(fisico);
        
        List<Produto> produtos = dao.lista();
        for (Produto produto : produtos) {
            System.out.println("Id: " + produto.getId());
            System.out.println("Nome" + produto.getNome());
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("Valor: " + produto.getValor());
            System.out.println("Isbn: " + produto.getIsbn());
        }
    } 
}