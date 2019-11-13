/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafram.livraria.modelo.produtos;

import br.com.fafram.livraria.modelo.produtos.Livro;
import br.com.fafram.livraria.modelo.Autor;

/**
 *
 * @author MuriloScapim
 */
public class MiniLivro extends Livro {

    public MiniLivro(Autor autor) {
        super(autor);
    } 

    @Override
    public void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do mini livro");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Descrição: " + super.getDescricao());
        System.out.println("Valor: " + super.getValor());
        System.out.println("ISBN: " + super.getIsbn());
        super.getAutor().mostrarDetalhes();
        System.out.println();
    }
}
