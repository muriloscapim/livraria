/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafram.livraria.produtos;

/**
 *
 * @author MuriloScapim
 */
public interface Produto {
    public abstract double getValor();
    public abstract String getNome();
    public abstract String getDescricao();
    public abstract String getIsbn();
}