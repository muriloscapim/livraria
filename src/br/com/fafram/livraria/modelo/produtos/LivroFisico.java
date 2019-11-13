/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafram.livraria.modelo.produtos;

import br.com.fafram.livraria.modelo.produtos.Livro;
import br.com.fafram.livraria.modelo.produtos.Promocional;
import br.com.fafram.livraria.modelo.Autor;

/**
 *
 * @author MuriloScapim
 */
public class LivroFisico extends Livro implements Promocional {
    
    public LivroFisico(Autor autor) {
        super(autor);
    }
    
    public double getTaxaImpressao() {
        return this.getValor() * 0.05;
    }  

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do livro físico");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Descrição: " + super.getDescricao());
        System.out.println("Valor: " + super.getValor());
        System.out.println("ISBN: " + super.getIsbn());
        super.getAutor().mostrarDetalhes();
        System.out.println();
    }
}