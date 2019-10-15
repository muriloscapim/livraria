/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafram.livraria.testes;

import br.com.fafram.livraria.produtos.Ebook;
import br.com.fafram.livraria.produtos.LivroFisico;
import br.com.fafram.livraria.Autor;

/**
 *
 * @author MuriloScapim
 */
public class RegrasDeDesconto {
    
    public static void main(String[] args) {
        
        Autor autor = new Autor();
        autor.setNome("Rodrigo");
        
        LivroFisico livro = new LivroFisico(autor);
        livro.setValor(59.90);
        
        if (livro.aplicaDescontoDe(0.4)) {
            System.out.println("Valor do livro com desconto: "
            + livro.getValor());
        } else {
            System.out.println("Desconto no livro não pode "
                    + "ser maior do que 30%");
        }
        
        Ebook ebook = new Ebook(autor);
        ebook.setValor(29.90);
        
        if (ebook.aplicaDescontoDe(0.3)) {
            System.out.println("Valor do Ebook com desconto: " +
                    ebook.getValor());
        } else {
            System.out.println("Desconto do Ebook não "
                    + "pode ser maior que 15%");
        }
    }
}