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
public final class Singleton {
    //(1)Por que a classe foi definida como Final?
    private static Singleton singleton;
    //(2) O que significa o objeto "singleton"?
    
    //(3) Por que criar um construtor privado?
    private Singleton(){
        JOptionPane.showMessageDialog(null, 
                "Mensagem do construtor\n\nSingleton foi criado.","Sucesso!",2);
    }
    
    //(4) Por que foi criado o método getSingletonInstance()?
    public static Singleton getSingletonInstance(){
        if (singleton == null)
            singleton = new Singleton();
        return singleton;
        //(5) Explicar o if para criação do "singleton"
    }
    
    /*
    *Método apenas ilustrativo
    *Não é necessário implementar o método...
    */
    public void abrirConexao(){
        //...
    }
}
