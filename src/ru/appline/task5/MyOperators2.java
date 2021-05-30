package ru.appline.task5;

import java.util.Arrays;
import java.util.Scanner;

public class MyOperators2 {
    public static void main(String[] args) {
        String[] operations = new String[]{"+", "-", "*", "/"};

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x: ");
        final float x = in.nextFloat();
        System.out.println("Введите число y: ");
        final float y = in.nextFloat();
        in.nextLine();
        System.out.println("Введите один из символов ‘+’, ‘-’, ‘*’ или ‘/’: ");
        String operation = in.nextLine();
        if (!Arrays.asList(operations).contains(operation)) {
            System.err.println("Введена неправильная операция");
        }
        final char oper = operation.charAt(0);
        float result = 0;
        switch (oper) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = x / y;
                break;
        }
        System.out.println("Результат: " + result);
    }
}
