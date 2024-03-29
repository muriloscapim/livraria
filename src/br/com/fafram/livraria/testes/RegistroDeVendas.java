/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafram.livraria.testes;

import br.com.fafram.livraria.modelo.CarrinhoDeCompras;
import br.com.fafram.livraria.modelo.produtos.Ebook;
import br.com.fafram.livraria.modelo.produtos.LivroFisico;
import br.com.fafram.livraria.modelo.Autor;
import br.com.fafram.livraria.modelo.produtos.MiniLivro;
import br.com.fafram.livraria.modelo.produtos.Produto;
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
              
        produtos.forEach(p -> {
            if (p instanceof LivroFisico) {
                ((LivroFisico) p).mostrarDetalhes();
            } else if (p instanceof Ebook) {
                ((Ebook) p).mostrarDetalhes();
            } else if (p instanceof MiniLivro) {
                ((MiniLivro) p).mostrarDetalhes();
            }
        });
        
        /* for (Produto produto : produtos) {
            System.out.println(produto);
        }
        */
        
        /*
        // Tratando as exceções de forma mais genérica
        for (int i = 0; i <= produtos.size(); i++) {
            try {
                Produto produto = produtos.get(i);
                if(produto != null) {
                    System.out.println(produto.getValor());
                }
            } catch (Exception e) {
                System.out.println("deu exception no indice: " + i);
                e.printStackTrace();
            }
        }
        
         // Tratativa diferente para cada tipo de exceção
        for (int i = 0; i <= produtos.size(); i++) {
            try {
                Produto produto = produtos.get(i);
                if(produto != null) {
                    System.out.println(produto.getValor());
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("deu exception no indice: " + i);
            } catch (NullPointerException e) {
                System.out.println("Lista não foi instanciada!");
            }
        }
        
        System.out.println("Fui executado!");
        */
    }
}