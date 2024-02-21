package prog.prueba_polimorf;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author larapresa
 */
public class claseB extends claseA{
    @Override
    // Sobreescribimos el método de la claseA
    public void imprime (){
        System.out.println("Soy un objeto de tipo clase B");
    }
    
    public void imprime2 (){
        System.out.println("***********************************************************************");
        System.out.println("Soy un objeto de clase B "
                + "declarado como clase B y puedo acceder a mis métodos específicos");
        System.out.println("***********************************************************************");
    }
}
