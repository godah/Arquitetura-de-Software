package com.observer;

import java.util.Observable;
import java.util.Observer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 317122368
 */
public class MostraCondicoesTempo implements Observer, MostraElemento{
    
    Observable obs;
    private double temperatura, umidade;
    
    public MostraCondicoesTempo(Observable obs){
        this.obs = obs;
        obs.addObserver(this);
        System.out.println("Adicionou Observador...");
        
    }

    @Override
    public void mostrar() {
    	System.out.println("Condi��es atuais: "+temperatura+"graus C. Umidade: "+
    						umidade+"% umidade.");
    }

    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof DadosTempo) {
        	DadosTempo dados = (DadosTempo)obs;
        	this.temperatura = dados.getTemperatura();
        	this.umidade = dados.getUmidade();
        	System.out.println("Executou update...");
        	mostrar();
        }
    }
    
}
