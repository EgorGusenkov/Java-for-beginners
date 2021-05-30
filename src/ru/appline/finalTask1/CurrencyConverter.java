package ru.appline.finalTask1;

import java.math.BigDecimal;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите курс доллара");
        final double dollarRate = in.nextDouble();
        System.out.println("Введите количество рублей");
        final double rub = in.nextDouble();
        if (BigDecimal.valueOf(rub).scale() > 2) {
            System.err.println("Введено неверное количество копеек");
            return;
        }
        System.out.println("Курс доллара: " + dollarRate);
        System.out.println("Количество рублей: " + rub);
        final double result = Math.ceil(rub / dollarRate * 100) / 100;
        String[] a = String.valueOf(result).split("[.]");
        int intResult = Integer.parseInt(a[0]);
        int fracResult = Integer.parseInt(a[1]);
        System.out.print("Итого: ");
        System.out.print(intResult + " " + fixNumerical(intResult, "доллар", "доллара", "долларов") + " ");
        System.out.print(fracResult + " " + fixNumerical(fracResult, "цент", "цента", "центов"));
    }

    public static String fixNumerical(int num, String... arr) {
        String result;
        if (num % 100 > 4 && num % 100 < 21) result = arr[2];
        else if (num % 10 == 1) result = arr[0];
        else if (num % 10 > 1 && num % 10 < 5) result = arr[1];
        else result = arr[2];
        return result;
    }
}
