/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafram.livraria.testes;

import br.com.fafram.livraria.testes.CarrinhoDeCompras;
import br.com.fafram.livraria.produtos.Ebook;
import br.com.fafram.livraria.produtos.LivroFisico;
import br.com.fafram.livraria.Autor;
import br.com.fafram.livraria.produtos.Produto;
import java.util.List;

/**
 *
 * @author MuriloScapim
 */
public class RegistroDeVendas {
    
    public static void main(String[] args) {
              
        Autor autor = new Autor();
        autor.setNome("Mauricio");
        
        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test Driven Development");
        fisico.setValor(59.90);
        
        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test Driven Development");
        ebook.setValor(29.90);
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);
        
        List<Produto> produtos = carrinho.getProdutos();
              
        /* for (Produto produto : produtos) {
            System.out.println(produto);
        }
        */
        
        for (int i = 0; i <= produtos.size(); i++) {
            Produto produto = produtos.get(i);
            if(produto != null) {
                System.out.println(produto.getValor());
            }
        }
        
        System.out.println("Fui executado!");
    }
}