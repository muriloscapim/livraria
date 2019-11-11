/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafram.livraria.modelo;

import br.com.fafram.livraria.modelo.produtos.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MuriloScapim
 */
public class CarrinhoDeCompras {
    
    private double total;
    private List<Produto> produtos;
    
    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<Produto>();
    }
    
    public void adiciona(Produto produto) {
        this.produtos.add(produto);
    }
    
    public void remove(int posicao) {
        this.produtos.remove(posicao);
    }
    
    public double getTotal() {
        return total;
    }
    
    public List<Produto> getProdutos(){
        return produtos;
    }
}