package ru.appline.task8;

import java.util.Scanner;

public class MyLoops2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число");
        final int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i = i + 2) {
            sum += i;
        }
        System.out.println("Сумма всех нечетных числел от 1 до " + n + ": " + sum);
    }
}
