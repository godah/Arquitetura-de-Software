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
public abstract class Bebida {
    String descricao = "Bebida desconhecida";
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public abstract double custo();
}
