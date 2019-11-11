/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fafram.livraria.testes;

/**
 *
 * @author MuriloScapim
 */
public class ConsultaDeDescontos {
    
    public static void main(String[] args) {
        
        GerenciadorDeCupons gerenciador =
                new GerenciadorDeCupons();
        
        if (gerenciador.validaCupom("CUP1234")) {
            System.out.println("Cupom de desconto válido.");
        } else {
            System.out.println("Esse cupom não existe.");
        }
    }
}