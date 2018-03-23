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
public abstract class Fabrica {
    protected String nome;
    
    public abstract Moto getMoto(String marca);
    
    public static Fabrica getInstance(String fabrica){
        if(fabrica.equalsIgnoreCase("Honda")){
            return new Honda();
        }else if(fabrica.equalsIgnoreCase("Yamaha")){
            return new Yamaha();
        }else if(fabrica.equalsIgnoreCase("Suzuki")){
            return new Suzuki();
        }else{
            return null;
        }
    }
}
