package ru.appline.task3;

import java.util.Arrays;
import java.util.Random;

public class MyArrays {

    public static void main(String[] args) {
        int[] myArray = new int[5];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = new Random().nextInt();
        }

        System.out.println(Arrays.toString(myArray));

        int lastElement = myArray[myArray.length - 1];
        myArray[myArray.length - 1] = myArray[0];
        myArray[0] = lastElement;

        System.out.println(Arrays.toString(myArray));

        System.out.println("Результат суммы первого и среднего элемента: "
                + Integer.sum(myArray[0], myArray[(myArray.length - 1) >>> 1]));
    }
}
