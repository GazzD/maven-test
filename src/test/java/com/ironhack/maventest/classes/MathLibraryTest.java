package com.ironhack.maventest.classes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathLibraryTest {

    private static MathLibrary mathLibraryAll;
    private MathLibrary mathLibrary;

    @BeforeEach
    void setUp() {
        System.out.println("Setting up");
        mathLibrary = new MathLibrary();
    }

    @BeforeAll
    static void setUpAll() {
        System.out.println("Setting up");
        mathLibraryAll = new MathLibrary();
    }

    @Test
    void add_positiveInts_summed() {
//        MathLibrary mathLibrary = new MathLibrary();
        assertEquals(2, mathLibrary.add(1, 1));
        assertEquals(11, mathLibrary.add(10, 1));
        assertEquals(1, mathLibrary.add(0, 1));
        assertEquals(20, mathLibrary.add(10, 10));
    }

    @Test
    void add_negativeInts_summed() {
        assertEquals(-10, mathLibrary.add(-9, -1));
    }

    @Test
    void createArray_fixLength_arrayCreated() {
        assertArrayEquals(new int[4], mathLibrary.createArray(4));
        assertArrayEquals(new int[10], mathLibrary.createArray(10));
        assertArrayEquals(new int[100], mathLibrary.createArray(100));
    }

    @Test
    void createArray_negativeLength_IllegalArgumentException() {
//        assertNull(mathLibrary.createArray(-1));
//        assertNull(mathLibrary.createArray(-2));
//        assertNull(mathLibrary.createArray(-10));
//        assertNull(mathLibrary.createArray(-100));

        assertThrows(IllegalArgumentException.class, () -> mathLibrary.createArray(-1));
        assertThrows(IllegalArgumentException.class, () -> mathLibrary.createArray(-2));
        assertThrows(IllegalArgumentException.class, () -> mathLibrary.createArray(-10));
        assertThrows(IllegalArgumentException.class, () -> mathLibrary.createArray(-100));

    }

    @Test
    void createArray_zeroLength_null() {
//        assertNull(mathLibrary.createArray(0));
//        if (mathLibrary.createArray(0) != null) {
//            fail("Array should not be created with length = 0");
//        }

        assertThrows(IllegalArgumentException.class, () -> mathLibrary.createArray(0));

    }



}