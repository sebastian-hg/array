package org.example;

public class Main {
    public static void main(String[] args) {
        String[] arrayTest = {
                "hello MY",
                "NAMe is SebasTian",
                "Iam from Venezuela",
                "but right NOw",
                "live in ARGENTINA",
                "I have beEN",
                "lived HEAR since ",
                "2017",
                "i fell HAPPY",
                "LIVING here"

        };
        StringBuilder stringBuilder = new StringBuilder();
        for (String item : arrayTest) {
            stringBuilder.append(item.replaceAll("\\s", "").toLowerCase());
        }

        System.out.println(stringBuilder);
    }
}