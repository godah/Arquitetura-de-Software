/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fabricaabstrata;

/**
 *
 * @author luciano
 */
public class Honda extends Fabrica {

    public Honda() {
        nome = "Fábrica da Honda (São José dos Campos - SP)";
    }

    //@Override
    public Moto getMoto(String marca) {
        if(marca == null){
            return null;
        }else if(marca.equalsIgnoreCase("CBX")){
            return new CBX();
        }else
            return null;
    }
    
    
}
