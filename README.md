# JAVA_Ejemplo_polimorfismo_y_casting

En este ejemplo tenemos 3 clases distintas. 
- Clase A: clase padre/madre
- Clase B: hereda de clase A
- Clase C: hereda de clase A

ClaseB y claseC sobreescriben el método imprime() que heredan de claseA. 

Desde el programa principal vamos a ver cómo se comporta **3 objetos DECLARADOS de tipo ClaseA** pero **instanciados cada uno de una clase** para ello usaremos un vector de longitud 3: 

- El primer objeto del vector se instancia de tipo claseA
- El segundo objeto del vector se instancia de tipo claseB
- El tercer objeto del vector se instancia de tipo claseC

La finalidad del ejemplo es ver a qué método imprime() están llamando cada uno de los objetos. 

Además, vemos que la claseB tiene definido un método específico, pero no podemos acceder a él ya que el objeto está declarado como claseA. Para poder emplearlo podemos comprobar con instanceof cómo se ha instanciado ese objeto y hacer una conversión de tipo (CAST) a claseB.  

**RECUERDA**
💡  El polimorfismo se da en tiempo de ejecución (ligadura dinámica). Esto sucede cuando una subclase sobrescribe algún método de la clase padre; esto hará que una misma llamada a un método conlleve la ejecución de métodos diferentes, dependiendo del objeto que llame a dicho método.

**ADEMÁS**

📌 Para que exista **POLIMORFISMO** se tienen que dar tres condiciones:

- Que haya HERENCIA.
- Que haya SOBREESCRITURA de métodos.
- DEFINIR un objeto con una SUPERCLASE (claseA) e INSTANCIARLO con una SUBCLASE (claseB): claseA obj=new claseB();




