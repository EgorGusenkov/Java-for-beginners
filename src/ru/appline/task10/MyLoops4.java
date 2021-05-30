package ru.appline.task10;

import java.util.Scanner;

public class MyLoops4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность матрицы m на n");
        System.out.println("Введите m");
        final int m = in.nextInt();
        System.out.println("Введите n");
        final int n = in.nextInt();
        double[][] myArray = new double[m][n];

        for (int i = 0; i < m; i++) {
            System.out.println("Введите значения " + (i + 1) + "-ой строки");
            for (int j = 0; j < n; j++) {
                myArray[i][j] = in.nextDouble();
            }
        }

        for (int j = 0; j < n; j++) {
            System.out.print((myArray[0][j] * 3) + " ");
        }
        //System.out.println(Arrays.deepToString(myArray));
    }
}
