package ru.appline.task11;

import java.util.Scanner;

public class ComparingTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Ввести первое целое число");
        Scanner in = new Scanner(System.in);
        String strVar = in.nextLine();
        if (!isNumeric(strVar)) {
            System.err.println("Введенное значение не являеся числом");
            return;
        }
        System.out.println("Ввести второе целое число");
        int intVar = in.nextInt();
        System.out.println("Большее число: " + Math.max(new Integer(strVar), intVar));
        System.out.println("Меньшее число: " + (double) Math.min(new Integer(strVar), intVar));
    }

    public static boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
