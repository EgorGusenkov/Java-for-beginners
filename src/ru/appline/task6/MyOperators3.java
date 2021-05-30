package ru.appline.task6;

import java.util.Arrays;
import java.util.Scanner;

public class MyOperators3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        final int quantity = in.nextInt();
        in.nextLine();
        if (quantity > 2) {
            System.err.println("Нверно выбрана физическая велечина");
            return;
        }
        final String[] unitWeight = {"kg", "lb", "ozt", "pd"};
        final String[] unitDistance = {"m", "mi", "yd", "ft"};
        final String unit;
        double val;
        Converter converter = new Converter();
        switch (quantity) {
            case 1:
                System.out.println("Выберите единицу измерения: kg - килограмм, lb -  английский фунт, ozt - тройская унция, pd - пуд");
                unit = in.nextLine();
                if (!Arrays.asList(unitWeight).contains(unit)) {
                    System.err.println("Неверно выбрана единица измерения");
                    return;
                }
                System.out.println("Введите число ");
                val = in.nextInt();
                val = converter.convertToDefaultWeight(val, unit);
                converter.printAllWeightValues(val);
                break;
            case 2:
                System.out.println("Выберите единицу измерения: m - метр, mi - миля, yd - ярд, ft - фут");
                unit = in.nextLine();
                if (!Arrays.asList(unitDistance).contains(unit)) {
                    System.err.println("Неверно выбрана единица измерения");
                    return;
                }
                System.out.println("Введите число ");
                val = in.nextInt();
                val = converter.convertToDefaultDistance(val, unit);
                converter.printAllDistanceValues(val);
                break;
        }
    }
}
