# Ejercicio 7: Etiqueta
Observe el siguiente código:

```java
abstract class Etiqueta {
    protected String nombreProducto;
    protected double precio;

    public Etiqueta(String nombre, double precio) {
        this.nombreProducto = nombre;
        this.precio = precio;
    }
}

class EtiquetaSimple extends Etiqueta {
    public EtiquetaSimple(String nombre, double precio) {
        super(nombre, precio);
    }

    public void generar() {
        System.out.println("--- ETIQUETA BÁSICA ---");
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Precio: $" + precio);
        System.out.println("-----------------------");
    }
}

class EtiquetaDetalle extends Etiqueta {
    public EtiquetaDetalle(String nombre, double precio) {
        super(nombre, precio);
    }

    public void generar() {
        System.out.println("--- ETIQUETA DETALLE ---");
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Precio sin imp.: $" + (precio * 0.79));
        System.out.println("Precio final: $" + precio);
        System.out.println("-----------------------");
    }
}

```
## Tareas
1. ¿Hay código duplicado? Indique claramente en qué líneas se encuentra.
2. Se quiere aplicar el refactoring Pull Up Method para subir el método generar() a la superclase Etiqueta. ¿Es posible hacerlo en el código anterior? Justifique su respuesta basándose en las precondiciones del refactoring vistas en la teoría y en el libro de Refactoring de Martin Fowler.
3. Mencione los refactorings previos necesarios para que sea posible aplicar Pull Up Method.
4. Aplique Pull Up Method para subir el método generar() a la superclase Etiqueta
## Respuestas
1. Existe codigo duplicado en las lineas 18 y 31, ambas contienen la misma estructura de impresión de la etiqueta, aunque con diferentes detalles. Además, las líneas 19 y 32 también tienen código similar, ya que ambas imprimen el nombre del producto y el precio, aunque con diferentes formatos.
2. No es posible aplicar el refactoring Pull Up Method para subir el método generar() a la superclase Etiqueta en el código anterior. Esto se debe a que el método generar() tiene implementaciones diferentes en las clases EtiquetaSimple y EtiquetaDetalle, lo que significa que no se puede unificar en una sola implementación en la clase base sin perder la funcionalidad específica de cada tipo de etiqueta. 
3. Las precondiciones del refactoring Pull Up Method requieren que el método a subir tenga una implementación común o que pueda ser implementado de manera genérica en la clase base, lo cual no es el caso aquí debido a las diferencias en la presentación de la información entre las dos clases derivadas. 
