package ru.appline.finalTask2;

import java.util.Scanner;

public class SimpleEquation {
    public static void main(String[] args) {
        System.out.println("Введите простое уравнение, например: 1+x=9");
        Scanner in = new Scanner(System.in);
        String simpleEquation = in.nextLine();
        if (!simpleEquation.matches("([x][+-][0-9]=[0-9])|([0-9][+-][x]=[0-9])|([0-9][+-][0-9]=[x])")) {
            System.err.println("Уравнение введено некорректно");
            return;
        }
        int result = 0;
        switch (simpleEquation.charAt(1)) {
            case '+':
                if (simpleEquation.charAt(0) == 'x') {
                    result = Character.getNumericValue(simpleEquation.charAt(4)) - Character.getNumericValue(simpleEquation.charAt(2));
                } else if (simpleEquation.charAt(2) == 'x') {
                    result = Character.getNumericValue(simpleEquation.charAt(4)) - Character.getNumericValue(simpleEquation.charAt(0));
                } else if (simpleEquation.charAt(4) == 'x') {
                    result = Character.getNumericValue(simpleEquation.charAt(0)) + Character.getNumericValue(simpleEquation.charAt(2));
                }
                break;
            case '-':
                if (simpleEquation.charAt(0) == 'x') {
                    result = Character.getNumericValue(simpleEquation.charAt(4)) + Character.getNumericValue(simpleEquation.charAt(2));
                } else if (simpleEquation.charAt(2) == 'x') {
                    result = Character.getNumericValue(simpleEquation.charAt(0)) - Character.getNumericValue(simpleEquation.charAt(4));
                } else if (simpleEquation.charAt(4) == 'x') {
                    result = Character.getNumericValue(simpleEquation.charAt(0)) - Character.getNumericValue(simpleEquation.charAt(2));
                }
                break;
        }
        System.out.println("x=" + result);
    }
}
