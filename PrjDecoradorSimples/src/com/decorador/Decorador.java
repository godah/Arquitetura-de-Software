/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decorador;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author 317122368
 */
public class Decorador {
    public static void main(String[] args) {
        String linguagem[] = {"C#","JAVA","C","PHP","RUBY","PYTHON",
                              "VISUAL BASIC","ADA","BASIC","COBO","DELPHI",
                              "PERL","LUA","PASCAL","C++","FORTRAN","LISP"};
        JTextArea saida = new JTextArea(8,20);
        JScrollPane scroll = new JScrollPane(saida);
        
        saida.setText("LINGUAGENS DE PROGRAMÇÃO\n\n");
        for (int i = 0; i < linguagem.length-1; i++) {
            saida.append("Posição "+(i+1)+"a. "+": "+linguagem[i]+"\n");
        }
        //JOptionPane.showMessageDialog(null, saida);
        JOptionPane.showMessageDialog(null, scroll);
    }
    
}
