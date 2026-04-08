package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class IntRingTest {
    private IntRing clase1;
    private IntRing clase2;
    private int[] arrayVacio;
    private int[] array1;
    @BeforeEach
    void SetUp(){
        this.array1 = new int[]{1,2,3};
        this.arrayVacio = new int[]{};
        this.clase1 = new IntRing(this.array1);
        this.clase2 = new IntRing(this.arrayVacio);
    }

    @Test
    public void testArrayVacio(){
        assertEquals(0, this.clase2.next());
    }

    @Test
    public void testArrayConElementos(){
        assertEquals(1, this.clase1.next());
        assertEquals(2, this.clase1.next());
        assertEquals(3, this.clase1.next());
        assertEquals(1, this.clase1.next());
    }

}
