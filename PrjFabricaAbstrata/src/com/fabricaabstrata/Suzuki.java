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
public class Suzuki extends Fabrica {

    public Suzuki() {
        nome = "Fábrica da Suzuki (Ribeirão Preto - SP)";
    }

    //@Override
    public Moto getMoto(String marca) {
        if(marca == null){
            return null;
        }else if(marca.equalsIgnoreCase("DRZ")){
            return new DRZ();
        }else
            return null;
    }
    
    
}
