/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adapter;

import javax.swing.JOptionPane;

/**
 *
 * @author 317122368
 */
public class AdaptadorLocutorAmericano implements PessoaBrasileira{
    PessoaAmericana objAmericano;
    
    public AdaptadorLocutorAmericano(PessoaAmericana objAmericana){
        this.objAmericano = objAmericano;
    }

    @Override
    public void falarPortugues() {
        JOptionPane.showMessageDialog(null, "Portugues Adaptado!");
        try{
            objAmericano.falarIngles();
        }catch(Exception e){
            
        }
    }

    @Override
    public void trabalhar() {
        for (int i = 0; i < 3; i++) {
            try{
                objAmericano.trabalhar();
            }catch(Exception e){
                
            }
        }
    }
    
    
}
