package ru.appline.task6;

import java.util.HashMap;
import java.util.Map;

public class Converter {
    //1 - килограмм, 2 -  английский фунт, 3 - тройская унция, 4 - пуд
    //kg lb ozt pd
    //1 - метр, 2 - миля, 3 - ярд, 4 - фут
    //m mi yd ft
    private final Map<String, Double> conversionRatioWeight = new HashMap<>();
    private final Map<String, Double> conversionRatioDistance = new HashMap<>();

    public Converter() {
        conversionRatioWeight.put("kg", 1d);
        conversionRatioWeight.put("lb", 2.20462d);
        conversionRatioWeight.put("ozt", 32.1507d);
        conversionRatioWeight.put("pd", 32.1507d);

        conversionRatioDistance.put("m", 1d);
        conversionRatioDistance.put("mi", 0.000621371d);
        conversionRatioDistance.put("yd", 1.09361d);
        conversionRatioDistance.put("ft", 3.28084d);
    }

    public double convertDistance(double value, String in, String out) {
        return value / conversionRatioDistance.get(in) * conversionRatioDistance.get(out);
    }

    public double convertWeight(double value, String in, String out) {
        return value / conversionRatioWeight.get(in) * conversionRatioWeight.get(out);
    }

    public double convertToDefaultDistance(double val, String in) {
        switch (in) {
            case "m":
                return val;
            case "mi":
                return convertDistance(val, "mi", "m");
            case "yd":
                return convertDistance(val, "yd", "m");
            case "ft":
                return convertDistance(val, "ft", "m");
            default:
                return val;
        }
    }

    public double convertToDefaultWeight(double val, String in) {
        switch (in) {
            case "kg":
                return val;
            case "lb":
                return convertWeight(val, "lb", "kg");
            case "ozt":
                return convertWeight(val, "ozt", "kg");
            case "pd":
                return convertWeight(val, "pd", "kg");
            default:
                return val;
        }
    }

    public void printAllDistanceValues(double val) {
        conversionRatioDistance.forEach((key, mapValue) -> {
            System.out.println(key + " = " + (val * mapValue));
        });
    }

    public void printAllWeightValues(double val) {
        conversionRatioWeight.forEach((key, mapValue) -> {
            System.out.println(key + " = " + (val * mapValue));
        });
    }
}