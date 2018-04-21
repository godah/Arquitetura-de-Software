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
public class LocutorAmericano implements PessoaAmericana{

    @Override
    public void falarIngles() {
        JOptionPane.showMessageDialog(null, "Sou um locutor Americano: Hello World!");
    }

    @Override
    public void trabalhar() {
        JOptionPane.showMessageDialog(null, "Sou um locutor Americano: I am Working!");
    }
    
}
