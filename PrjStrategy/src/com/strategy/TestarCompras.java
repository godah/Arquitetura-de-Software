/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strategy;

/**
 *
 * @author 317122368
 */
public class TestarCompras {
    public static void main(String[] args) {
        /*
        Cliente normal = new ClienteNormal();
        //Verifica o comportamento para os clientes - Normal
        normal.mostrar();
        normal.executarCompra();
        //Verifica o comportamento para os clientes - Prata
        Cliente prata = new ClientePrata();
        prata.mostrar();
        prata.executarCompra();
        */
        
        Cliente ouro = new ClienteOuro();
        ouro.mostrar();
        //clientes ouro fazendo compras normais
        ouro.setComportamentoComprar(new Comprar());
        ouro.executarCompra();
        //clientes ouro fazendo compras com 10 Dias
        ouro.setComportamentoComprar(new Comprar10Dias());
        ouro.executarCompra();
        //clientes ouro fazendo compras com 30 Dias
        ouro.setComportamentoComprar(new Comprar30Dias());
        ouro.executarCompra();
        
    }
}
