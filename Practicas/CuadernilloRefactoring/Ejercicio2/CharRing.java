/*
* Tareas:
Se quiere aplicar el refactoring Rename Variable sobre la variable result que se usa en la
* línea 18 con el nuevo nombre currentPosition.
¿Cómo queda el código final y qué inconveniente se podría encontrar?
*/
public class CharRing extends Object {
    char[] source;
    int nextIndex;

    public CharRing(String srcString) {
        char currentCharIndex;
        source = new char[srcString.length()];
        srcString.getChars(0, srcString.length(), source, 0);
        currentCharIndex = 0;
        nextIndex = currentCharIndex;
    }

    public char next() {
        int currentCharIndex;
        if (nextIndex >= source.length)
            nextIndex = 0;
        currentCharIndex = nextIndex++;
        return source[currentCharIndex];
    }
  }
/* Al cabiar el nombre de la variable a uno que sea mas especifico, el idx tambien presenta un nombre
* confunso, cambie de idx a nextIndex. Esto tambien lo hice en CharRing.
* Existen otros bad smells como:
* herencia innecesaria: la herencia de la clase Object es totalmente innesario
* Posible bug en srcString: si este es vacio, devuelve source[0] que devuelve ArrayIndexOutOfBOunds
* Encapsulamiento debil: tanto source como nextIndex no son privados
* currentCharIndex es varible temporal inncesaria
* */

public class CharRing {
    private final char[] source;
    private int nextIndex;

    public CharRing(String srcString){
        if (srcString == null || srcString.isEmpty()) {
            throw new IllegalArgumentException("srcString cannot be null or empty");
        }
        source = srcString.toCharArray();
        nextIndex = 0;
    }

    public char next(){
        if(source.length == 0){
            throw new IllegalStateException("Source string cannot be empty");
        }
        if (nextIndex >= source.length )
            nextIndex = 0;
        return source[nextIndex++];
    }
}
