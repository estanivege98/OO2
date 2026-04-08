package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CharRingTest {
    private CharRing clase1;
    private CharRing clase2;
    private String arrayVacio;
    private String array1;

    @BeforeEach
    void SetUp(){
        this.array1 = new String("abc");
        this.arrayVacio = new String("");
        this.clase1 = new CharRing(this.array1);
        this.clase2 = new CharRing(this.arrayVacio);
    }

    @Test
    public void testStringVacio(){
        assertEquals((char) 0, this.clase2.next());
    }

    @Test
    public void testArrayConElementos(){
        assertEquals('a', this.clase1.next());
        assertEquals('b', this.clase1.next());
        assertEquals('c', this.clase1.next());
        assertEquals('a', this.clase1.next());
    }
}
