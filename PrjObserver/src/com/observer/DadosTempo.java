/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.observer;
import java.util.Observable;

/**
 *
 * @author 317122368
 */
public class DadosTempo extends Observable{
    private double t,u;
    
    public DadosTempo(){    
    }
    
    public void mudancaMedidas(){
        setChanged();
        notifyObservers();
        System.out.println("Executando mudancaMedidas...");
    }
    
    public void setMedidas(double t, double u){
        this.t = t;
        this.u = u;
        System.out.println("Executou setMedidas...");
        mudancaMedidas();
    }
    
    public double getTemperatura(){
        return this.t;
    }
    
    public double getUmidade(){
        return this.u;
    }
}
