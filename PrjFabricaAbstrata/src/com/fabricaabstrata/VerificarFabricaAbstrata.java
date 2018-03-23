/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fabricaabstrata;

import javax.swing.JOptionPane;

/**
 *
 * @author luciano
 */
public class VerificarFabricaAbstrata {
    public static void main(String[] args){
        while(true){
            //Instância do fabricante
            String nomeFabrica = JOptionPane.showInputDialog(
                                "Nome do Fabricante: ");
            Fabrica fab = Fabrica.getInstance(nomeFabrica);

            if  (fab == null){
                JOptionPane.showMessageDialog(null, 
                        "* * * FÁBRICA NÃO EXISTE * * *");
                break;
            }
            
            //Instância da Moto
            String nomeMoto = JOptionPane.showInputDialog(
                                "Nome (classe) da moto: ");
            Moto moto = fab.getMoto(nomeMoto);
            
            //Mostra os dois dados
            if (moto != null){
                JOptionPane.showMessageDialog(null, 
                                "Fabricante: "+fab.nome+"\n"+
                                "- - - - - - - - - - - - - - - - - - - - -\n"+
                                "Nome: "+moto.nome+"\n"+
                                "Cor: "+moto.cor+"\n"+
                                "Cilindrada: "+moto.cilindrada+"\n"+
                                "Valor: "+moto.valor+"\n");
            }else
                JOptionPane.showMessageDialog(null, 
                                "* * * MOTO NÃO EXISTE PARA ESSA FÁBRICA * * *");
        }
    }
}
