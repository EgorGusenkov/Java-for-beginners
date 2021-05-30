package ru.appline.task13;

import java.util.Scanner;

public class LatinWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку из слов, разделенных пробелами");
        String str = in.nextLine();
        int counter = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : str.split(" ")) {
            if (word.replaceAll("[а-яА-Я]", "").length() == 0) {
                stringBuilder.append(word).append(" ");
                counter++;
            }
        }
        if (stringBuilder.length() == 0) {
            System.out.println("Строка не содержит слов, состоящих только из латиницы");
        } else {
            System.out.println(stringBuilder);
            System.out.println("Количество слов, состоящих только из латиницы: " + counter);
        }
    }
}
