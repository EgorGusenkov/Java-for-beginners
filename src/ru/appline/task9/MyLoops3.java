package ru.appline.task9;

import java.util.Scanner;

public class MyLoops3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        final int lengthArray = in.nextInt();
        System.out.println("Введите значения массива");
        double[] myArray = new double[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            myArray[i] = in.nextDouble();
        }

        double average = 0;

        for (double val : myArray) {
            average += val;
        }
        average /= lengthArray;

        for (double val : myArray) {
            System.out.print(val * average + " ");
        }
    }
}
