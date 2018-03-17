/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fabricamethod;

import javax.swing.JOptionPane;

/**
 *
 * @author 317122368
 */
public class VerificarFabrica {
    public static void main(String[] args) {
        while(true){
            String varNome = JOptionPane.showInputDialog(
                "Classe da Moto");
            Moto moto = MotoFabrica.getMoto(varNome);
            //(1)Porque não foi necessário a implementação do 
            //método setNome()?
            //Resposta: Porque o nome é passado como parametro de getMoto(String tipoMoto);
            if(moto != null){
                JOptionPane.showMessageDialog(null, 
                        "Modelo disponível na fábrica: "+moto.getNome());
            }else{
                JOptionPane.showMessageDialog(null, 
                        "\n * * MODELO NÃO DISPONÍVEL NA FÁBRICA * * * \n");
            }
        }
    }
}
