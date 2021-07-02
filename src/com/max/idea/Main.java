package com.max.idea;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        byte a = 2;
        short b = 3;
        int c = 4;
        long d = 5;
        char e = 'A';
        float m = 7.0f;
        double g = 0.8;
        Boolean l = true;
        System.out.println("Byte max = " + Byte.MAX_VALUE + ".Byte min = " + Byte.MIN_VALUE);
        System.out.println("Short max = " + Short.MAX_VALUE + ".Short min = " + Short.MIN_VALUE);
        System.out.println("Integer max = " + Integer.MAX_VALUE + ".Integer min = " + Integer.MIN_VALUE);
        System.out.println("Long max = " + Long.MAX_VALUE + ".Long min = " + Long.MIN_VALUE);
        System.out.println("Character max = " + Character.MAX_VALUE + ".Character min = " + Character.MIN_VALUE);
        System.out.println("Float max = " + Float.MAX_VALUE + ".Float min = " + Float.MIN_VALUE);
        System.out.println("Double max = " + Double.MAX_VALUE + ".Double min = " + Double.MIN_VALUE);

        int [] mas = {11, 3, 14, 16, 1};
        boolean isSorted = false;
        int buf;
        int plus = 0;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
                    plus++;
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }

        System.out.println("\nSorted array " + Arrays.toString(mas));
        System.out.println("Iteretions: "+plus);
        System.out.println("Min Element = " + mas[0]);
        System.out.println("Max Element = " + mas[mas.length-1]);

    }
}