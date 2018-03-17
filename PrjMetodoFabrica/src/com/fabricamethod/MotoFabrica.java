/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fabricamethod;

/**
 *
 * @author 317122368
 */
public class MotoFabrica {
    public static Moto getMoto(String tipoMoto){
        if (tipoMoto.equalsIgnoreCase("Suzuki"))
            return new Suzuki();
        else if(tipoMoto.equalsIgnoreCase("Yamaha"))
            return new Yamaha();
        else if(tipoMoto.equalsIgnoreCase("Honda"))
            return new Honda();

        return null;
    }
}
