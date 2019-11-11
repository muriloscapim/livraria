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
public class Ebook extends Livro implements Promocional {
    
    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }
    
    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        
        if (porcentagem > 0.15) {
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
}