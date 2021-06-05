package ru.appline.finalTask4;

import java.util.Scanner;

public class Riddle {
    private static final String CORRECT_ANSWER = "Заархивированный вирус";
    private static final String RIDDLE = "Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает";
    private static final String CUE = "Подсказка";
    private static final int NUMBER_OF_ATTEMPTS = 3;
    private static final String RIGHT = "Правильно!";
    private static final String THINK_AGAIN = "Подумай еще!";
    private static final String BYE_BYE = "Обидно, приходи в другой раз";
    private static final String HELP = "Ходят слухи, что так взломали пентагон";
    private static final String NOT_HELP = "Подсказка уже недоступна";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(RIDDLE);
        for (int attempt = 1; attempt <= NUMBER_OF_ATTEMPTS; ++attempt) {
            String userResponse = in.nextLine();
            if (userResponse.equals(CORRECT_ANSWER)) {
                System.out.println(RIGHT);
                return;
            } else if (attempt == NUMBER_OF_ATTEMPTS) {
                System.out.println(BYE_BYE);
            } else if (attempt == 1 && userResponse.equals(CUE)) {
                System.out.println(HELP);
                if (in.nextLine().equals(CORRECT_ANSWER)) {
                    System.out.println(RIGHT);
                } else {
                    System.out.println(BYE_BYE);
                }
                return;
            } else if (attempt != 1 && userResponse.equals(CUE)) {
                System.out.println(NOT_HELP);
                attempt--;
            } else {
                System.out.println(THINK_AGAIN);
            }
        }
    }
}
