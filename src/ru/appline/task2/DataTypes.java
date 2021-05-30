package ru.appline.task2;

import java.util.Random;

public class DataTypes {

    public static void main(String[] args) {
        double randomDouble = new Random().nextDouble();
        final byte MAX_BYTE = Byte.MAX_VALUE;
        System.out.println("Произвольное дробное значение переменной типа с плавающей точкой с наибольшим диапазоном чисел: " + randomDouble);
        System.out.println("Наибольшее возможное значение переменной целочисленного типа с наименьшим диапазоном чисел: " + MAX_BYTE);
    }
}


