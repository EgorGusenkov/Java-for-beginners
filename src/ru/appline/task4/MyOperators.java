package ru.appline.task4;

import java.util.Scanner;

public class MyOperators {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x: ");
        final float x = in.nextFloat();
        System.out.println("Введите число y: ");
        final float y = in.nextFloat();
        System.out.println("Введите число z: ");
        final float z = in.nextFloat();
        final float arithmeticMean = (x + y + z) / 3;
        System.out.println("Среднее арифметическое чисел x,y,z: " + arithmeticMean);
        final double roundedHalfArithmeticMean = Math.floor(arithmeticMean / 2);
        if (roundedHalfArithmeticMean > 3) {
            System.out.println("Программа выполнена корректно");
        }
        //System.out.println("Округленное в меньшую сторону среднее арифметическое чисел x,y,z, разделенное на 2: " + roundedHalfArithmeticMean);
    }
}
