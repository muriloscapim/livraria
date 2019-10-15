/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafram.livraria.exception;

/**
 *
 * @author MuriloScapim
 */
public class AutorNuloException extends RuntimeException {
    
    public AutorNuloException(String mensagem) {
        super(mensagem);
    }
}
