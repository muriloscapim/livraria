/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafram.livraria.testes;

import br.com.fafram.livraria.Autor;
import br.com.fafram.livraria.produtos.LivroFisico;

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
        
        RepositorioDeProdutos repo = new RepositorioDeProdutos();
        repo.adiciona(fisico);
    } 
}
