package ru.appline.task14;

import java.util.Arrays;
import java.util.Random;

public class randomArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArray = new int[15];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(41) - 20; // [-20; 20]
        }
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
        System.out.println("Минимальное число: " + myArray[0]);
        System.out.println("Максимальное число: " + myArray[myArray.length - 1]);
        System.out.println("Из максимального и минимального значения наибольшее по модулю: " + Math.max(Math.abs(myArray[0]), Math.abs(myArray[myArray.length - 1])));
    }
}
