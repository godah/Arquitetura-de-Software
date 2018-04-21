/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strategy;

import javax.swing.JOptionPane;

/**
 *
 * @author 317122368
 */
public class Comprar30Dias implements ComportamentoComprar{

    @Override
    public void comprar() {
        JOptionPane.showMessageDialog(null, 
                "Comportamento COMPRAR 30 DIAS");
    }
    
}
