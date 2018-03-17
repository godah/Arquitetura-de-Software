/*
 *Ref.
*DEITEL, Harvey and Paul.
*Java How to program. 4th Edition
*2002. Prenteci Hall Inc. Page 496
*/
package com.singleton;
import javax.swing.*;
/**
 *
 * @author 317122368
 */
public class TesteSingleton {
    public static void main(String[] args){
        //Declara referências
        Singleton singleton1;
        Singleton singleton2;
        //Cria objetos
        singleton1 = Singleton.getSingletonInstance();
        singleton2 = Singleton.getSingletonInstance();
        
        //Criando terceiro objeto, alterar o construtor para public
        //Singleton singleton3= new Singleton();
        
        System.out.println("Endereço singleton 1: "+singleton1.hashCode());
        System.out.println("Endereço singleton 2: "+singleton2.hashCode());
        //System.out.println("Endereço singleton 3: "+singleton3.hashCode());
        
        //Por que getSingletonInstance() foi chamado diretamente da classe?
        if (singleton1 == singleton2)
            JOptionPane.showMessageDialog(null, 
                    "ATENÇÃO! "
                            + "singleton1 e singleton2 "
                            + "se referem a mesma instância de Singleton.");
    }
}
