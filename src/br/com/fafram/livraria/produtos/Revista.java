/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafram.livraria.produtos;

import br.com.fafram.livraria.produtos.Produto;
import br.com.fafram.livraria.produtos.Promocional;
import br.com.fafram.livraria.Editora;

/**
 *
 * @author MuriloScapim
 */
public class Revista implements Produto, Promocional {
    
    private String nome;
    private String descricao;
    private double valor;
    private Editora editora;
    
    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        
        if (porcentagem > 0.10) {
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
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

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    } 

    @Override
    public String getIsbn() {
        return null;
    }
}