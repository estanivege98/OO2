# Ejercicio 8 - Documentos y estadísticas
Dado el siguiente código implementado en la clase Document y que calcula algunas estadísticas del mismo:

```java
public class Document {
    List<String> words;
  
    public long characterCount() {
 	long count = this.words
.stream()
.mapToLong(w -> w.length())
.sum();
    	return count;
	}
    public long calculateAvg() {
    	long avgLength = this.words
.stream()
.mapToLong(w -> w.length())
.sum() / this.words.size();
 	return avgLength;
	}
// Resto del código que no importa
}
```
## Tareas:
1. Enumere los code smell y que refactorings utilizará para solucionarlos.
2. Aplique los refactorings encontrados, mostrando el código refactorizado luego de aplicar cada uno.
3. Analice el código original y detecte si existe un problema al calcular las estadísticas. Explique cuál es el error y en qué casos se da ¿El error identificado sigue presente luego de realizar los refactorings? En caso de que no esté presente, ¿en qué momento se resolvió? De acuerdo a lo visto en la teoría, ¿podemos considerar esto un refactoring?

## Respuestas:
1. Code Smell: - Duplicación de código: Ambos métodos `characterCount` y `calculateAvg` realizan la misma operación de sumar las longitudes de las palabras. 
2. Refactorings: - Extraer método: Podemos extraer la lógica de suma de longitudes en un método separado para evitar la duplicación de código.
3. El error en el código original es que si la lista de palabras está vacía, el método `calculateAvg` lanzará una excepción de división por cero. Este error se da cuando no hay palabras en el documento. Después de aplicar el refactoring de extraer método, podemos agregar una verificación para evitar la división por cero, lo que resuelve el problema. Sí, esto se puede considerar un refactoring ya que estamos mejorando la estructura del código sin cambiar su comportamiento externo.
