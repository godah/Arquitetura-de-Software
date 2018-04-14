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
public class Expresso extends Bebida{
    public Expresso(){
        this.descricao = "EXPRESSO";
    }
    
    public double custo(){
        return 1.50;
    }
}
