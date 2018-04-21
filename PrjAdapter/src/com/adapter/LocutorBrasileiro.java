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
public class LocutorBrasileiro implements PessoaBrasileira{

    @Override
    public void falarPortugues() {
        JOptionPane.showMessageDialog(null, "Sou um locutor Brasileiro: Alo Mundo!");
    }

    @Override
    public void trabalhar() {
        JOptionPane.showMessageDialog(null, "Sou um locutor Brasileiro: Estou Trabalhando!");
    }
        
}
