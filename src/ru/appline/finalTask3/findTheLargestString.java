package ru.appline.finalTask3;

import com.sun.xml.internal.ws.api.ha.HaInfo;
import com.sun.xml.internal.ws.message.stream.StreamAttachment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class findTheLargestString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Количество строк: ");
        String[] strArray = new String[in.nextInt()];
        in.nextLine();
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < strArray.length; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            strArray[i] = in.nextLine();
            Map<Character, Integer> uniqueSymbols = new HashMap<>();
            for (Character symbol : strArray[i].toCharArray()) {
                uniqueSymbols.put(symbol, i);
            }
            if (uniqueSymbols.size() > max) {
                max = uniqueSymbols.size();
                maxIndex = i;
            }
        }
        System.out.println("Ответ: " + strArray[maxIndex]);
    }
}
