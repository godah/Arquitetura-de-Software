/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strategy;

/**
 *
 * @author 317122368
 */
public abstract class Cliente {
    ComportamentoComprar comportamentoComprar;
    public abstract void mostrar();
    public void executarCompra(){
        comportamentoComprar.comprar();
    }
    
    //Método para executar o comportamento dinâmico (cd)
    public void setComportamentoComprar(ComportamentoComprar cd){
        comportamentoComprar = cd;
    }
}