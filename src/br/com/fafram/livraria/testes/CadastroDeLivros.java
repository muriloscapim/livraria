/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafram.livraria.testes;

import br.com.fafram.livraria.modelo.produtos.LivroFisico;
import br.com.fafram.livraria.modelo.produtos.Livro;
import br.com.fafram.livraria.modelo.Autor;

/**
 *
 * @author MuriloScapim
 */
public class CadastroDeLivros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Autor autor = new Autor();
        autor.setNome("Rodrigo");
        autor.setEmail("rodrigo@email.com.br");
        autor.setCpf("123.456.789-10");
        
        Livro livro = new LivroFisico(autor);
        livro.setNome("Java Orientado a Objetos");
        livro.setDescricao("Novos recursos da linguaguem");
        livro.setValor(59.90);
        livro.setIsbn("978-85-66250-46-6");
        //livro.setAutor(autor);
        
        livro.mostrarDetalhes();
        
        Autor outroAutor = new Autor();
        outroAutor.setNome("Paulo");
        outroAutor.setEmail("paulo@email.com.br");
        outroAutor.setCpf("123.456.789-10");
        
        Livro outroLivro = new LivroFisico(outroAutor);
        outroLivro.setNome("Lógica de programação");
        outroLivro.setDescricao("Crie seus primeiros programas");
        outroLivro.setValor(59.90);
        outroLivro.setIsbn("978-85-66250-22-0");
        //outroLivro.setAutor(outroAutor);
        
        outroLivro.mostrarDetalhes();
    }  
}