package ru.appline.task7;

import java.util.Scanner;

public class MyLoops1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        final int lengthArray = in.nextInt();
        System.out.println("Введите значения массива");
        double[] myArray = new double[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            myArray[i] = in.nextDouble();
        }

        final double x = 1;
        final double y = 2;
        final double z = 3;

        for (double val : myArray) {
            if (val == x || val == y || val == z) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }
}
