/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.decoratorcafe;
import javax.swing.*;

/**
 *
 * @author 317122368
 */
public class VerificaDecoradorCafe {
    public static void main(String[] args) {
        //String para saida dos dados
        String resultado = "";
        //Interface para saída de dados
        JTextArea saida = new JTextArea(10,40);
        saida.setText("PEDIDOS NO STARBUZZ COFEE\n\n");
        saida.setLineWrap(true);
        //CASO 1: Pedido de um café expresso SEM condimento
        Bebida bebida1 = new Expresso();
        resultado = resultado + "\nCASO 1: "+bebida1.getDescricao()+
                " -> R$ "+bebida1.custo()+"\n";
        //CASO 2: Pedido de um café expresso COM condimento LEITE
        Bebida bebida2 = new Expresso();
        bebida2 = new Leite(bebida2);
        resultado = resultado + "\nCASO 2: "+bebida2.getDescricao()+
                " -> R$ "+bebida2.custo()+"\n";
        //MOSTRA RESULTADO - CASO 1 E 2
        saida.append(resultado);
        JOptionPane.showMessageDialog(null, saida);
        //OUTRA COMBINAÇÃO *******************************************
        //CASO 3: Pedido de um descafeinado com Leite, Soja e Chocolate
        Bebida bebida3 = new Descafeinado();
        bebida3 = new Leite(bebida3);
        bebida3 = new Soja(bebida3);
        bebida3 = new Chocolate(bebida3);
        resultado = "";
        resultado = resultado + "\nCASO 3: "+ bebida3.getDescricao()+
                " -> R$ "+bebida3.custo()+"\n";
        //MOSTRA RESULTADO - CASO 3
        saida.append(resultado);
        JOptionPane.showMessageDialog(null, saida);
        
    }
    
}
