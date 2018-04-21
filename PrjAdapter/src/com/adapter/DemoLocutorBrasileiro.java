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
public class DemoLocutorBrasileiro {
    public static void main(String[] args) {
        LocutorBrasileiro objLocutorB = new LocutorBrasileiro();
        
        LocutorAmericano objLocutorA = new LocutorAmericano();
        
        PessoaBrasileira objAdaptadoLocutorBrasileiro =
                new AdaptadorLocutorAmericano(objLocutorA);
        
        JOptionPane.showMessageDialog(null, "AMERICANO ...");
        objLocutorA.falarIngles();
        objLocutorA.trabalhar();
        JOptionPane.showMessageDialog(null, "BRASILEIRO ...");
        objLocutorB.falarPortugues();
        objLocutorB.trabalhar();
        
        JOptionPane.showMessageDialog(null, "ADAPTADOR AMERICANO ...");
        testeAmericano(objAdaptadoLocutorBrasileiro);
    }
    
    static void testeAmericano(PessoaBrasileira objLocutorB){
        objLocutorB.falarPortugues();
        objLocutorB.trabalhar();
    }
}
