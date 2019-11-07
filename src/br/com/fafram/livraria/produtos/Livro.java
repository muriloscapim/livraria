/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafram.livraria.produtos;

import br.com.fafram.livraria.produtos.Produto;
import br.com.fafram.livraria.Autor;
import br.com.fafram.livraria.exception.AutorNuloException;

/**
 *
 * @author MuriloScapim
 */
public abstract class Livro implements Produto {
    
    private Integer id;
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    
    private Autor autor;
    
    public Livro(Autor autor){
        
        if (autor == null) {            
            throw new AutorNuloException(
                    "O Autor do Livro não pode ser nulo");
        }
        this.autor = autor;
    }
      
    public void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do livro ");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        autor.mostrarDetalhes();
        System.out.println("--");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }  
}