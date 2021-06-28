package com.ironhack.maventest.classes;

public class MathLibrary {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int[] createArray(int length) throws IllegalArgumentException {

        if (length <= 0) {
            throw new IllegalArgumentException("El tamaño del arreglo tiene que ser positivo y mayor a 0");
        }

        return new int[length];

    }
}
