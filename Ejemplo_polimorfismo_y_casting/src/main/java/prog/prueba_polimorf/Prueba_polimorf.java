/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package prog.prueba_polimorf;

/**
 *
 * @author larapresa
 */
public class Prueba_polimorf {

    public static void main(String[] args) {
        // Declaramos un vector de objetos de tipo CLASE A
        claseA[] vector = new claseA[3];
        // Instanciamos los objetos cada uno de una CLASE
        vector[0] = new claseA(); // Instanciamos objeto de CLASE A
        vector[1] = new claseB(); // Instanciamos objeto de CLASE B
        vector[2] = new claseC(); // Instanciamos objeto de CLASE C

        // Comprobamos a qué método imprime cada objeto instanciado
        for (int i = 0; i < 3; i++) {
            System.out.println("Soy el elemento del vector número " + i + ".");
            // vector[0] como hemos instanciado un objeto de la clase A llama a imprime de la CLASE A
            // vector[1] como hemos instanciado un objeto de la clase A llama a imprime de la CLASE B
            // vector[2] como hemos instanciado un objeto de la clase A llama a imprime de la CLASE C
            vector[i].imprime();
        }
        // --------------------------------------------------------------------------------
        // la clase B tiene un método específico (no heredado de claseA) que se llama imprime2
        // --------------------------------------------------------------------------------
        // vector[1].imprime2(); 
        /**
         * así no podemos acceder al método imprime2, porque vector[1] ha sido
         * declarado como claseA y SOLO puede acceder a los métodos de la
         * claseA. Ya hemos visto que puede ejecutar el método imprime() de la
         * claseA PERO ejecuta el suyo que ha sobreescrito en la claseB
         *
         */
        // Crear una instancia de claseB y asignarla a una variable de tipo claseA

        // Hacer un cast de vector[1] que está declarado como claseA e instanciado como claseB a un objeto declarado como claseB
        // vector[1] ---- CAST A ----> ojb2 (declarado como claseB)
        if (vector[1]instanceof claseB) {
            claseB  obj2 = (claseB) vector[1];

            // Ahora puedes usar obj2 como una instancia de claseB
            // Pudiendo llamar al método específico de claseB
            obj2.imprime2();
        } else {
            System.out.println("No se puede realizar el cast, obj1 no es una instancia de claseB");
        }
    }

}
