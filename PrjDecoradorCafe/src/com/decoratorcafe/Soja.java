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
public class Soja extends DecoradorCondimento{
    Bebida bebida;
    public Soja(Bebida bebida){
        this.bebida = bebida;
    }
    
    public String getDescricao(){
        return this.bebida.getDescricao()+", DECORADO COM SOJA";
    }
    
    public double custo(){
        return 1.50 + this.bebida.custo();
    }
    
}
