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
public class ClienteOuro extends Cliente{

    @Override
    public void mostrar() {
        JOptionPane.showMessageDialog(null, 
                "CLIENTE OURO");
    }
    
}
