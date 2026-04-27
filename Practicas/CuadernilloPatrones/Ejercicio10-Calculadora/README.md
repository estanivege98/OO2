# Ejercicio 10: Calculadora

Se desea diseñar e implementar una calculadora que realice operaciones matemáticas básicas, similar a las calculadoras tradicionales. Esta calculadora permitirá al usuario ingresar valores numéricos y realizar operaciones de suma, resta, multiplicación y división. Además, contará con la posibilidad de borrar la entrada actual y reiniciar los cálculos.
La calculadora debe responder a los siguientes mensajes

```java
    /**
    * Devuelve el resultado actual de la operación realizada.
    * Si no se ha realizado ninguna operación, devuelve el valor acumulado.
    * Si la calculadora se encuentra en error, devuelve “error”
    */
  public String getResultado() {...}


    /**
     * Pone en cero el valor acumulado y reinicia la calculadora
     */
    public void borrar() {...}


    /**
     * Asigna un valor para operar. 
     * si hay una operación en curso, el valor será utilizado en la operación
     */
    public void setValor(double unValor) {...}


     /**
      * Indica que la calculadora debe esperar un nuevo valor. 
      * Si a continuación se le envía el mensaje setValor(), la calculadora sumará
      * el valor recibido como parámetro, al valor actual y guardará el resultado 
      */
    public void mas() {...} 
```
Además, se debe tener en cuenta el siguiente comportamiento:
- Los mensajes menos(), por() y dividido(), actúan de manera similar al mensaje mas, pero realizan las operaciones correspondientes de resta, multiplicación y división .
- La calculadora entra en error en caso de que se intente dividir por cero.
- Si la calculadora está esperando un valor, y se le envía cualquier otro mensaje, entonces entra en error.
- Si se le envió previamente un mensaje de operación (mas, menos.. ) pero luego no se le envía el mensaje setValor(), la calculadora entra en error.
- Solo sale de error si se le envía el mensaje borrar().
- Cuando la calculadora está en error, el mensaje resultado() retorna el string Error.
El siguiente código muestra el uso de la clase Calculadora
```java
Calculadora calc = new Calculadora(); 
calc.setValor(5); // Establece el valor inicial 
calc.mas(); // Prepara para sumar 
calc.setValor(3); // Suma 3 al valor acumulado 
System.out.println(calc.resultado()); // Imprimirá "8.0"
calculadora.por();
calculadora.setValor(2);
assertEquals(calculadora.resultado(), "16.0");

```

## Tareas
1. Realice un diseño UML. Si utiliza algún patrón indique cuál(es) y justifique su uso.
2. Programe su solución en Java. Debe implementarse respetando todas las buenas prácticas de diseño y programación de POO.
3. Programe los test para la implementación propuesta.


