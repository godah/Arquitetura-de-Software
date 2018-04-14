/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decoratorcafe;

/**
 *
 * @author 317122368
 */
public class Leite extends DecoradorCondimento{
    Bebida bebida;
    public Leite(Bebida bebida){
        this.bebida = bebida;
    }
    
    public String getDescricao(){
        return this.bebida.getDescricao()+", DECORADO COM LEITE";
    }
    
    public double custo(){
        return .50 + this.bebida.custo();
    }
}
