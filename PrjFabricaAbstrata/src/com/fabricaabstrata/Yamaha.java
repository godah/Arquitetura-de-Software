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
public class Yamaha extends Fabrica {

    public Yamaha() {
        nome = "Fábrica Yamaha (São Bernardo do Campo - SP)";
    }
    

    @Override
    public Moto getMoto(String marca) {
        if (marca == null){
            return null;
        }else if(marca.equalsIgnoreCase("XTZ")){
            return new XTZ();
        }else
            return null;
    }
    
}
