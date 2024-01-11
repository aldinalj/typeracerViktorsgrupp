package com.fredrik.typeRacer;

public class Accuracy {
    public static void showCorrectStatistics(String speedGameSentences, String sentence) {
        StringBuilder result = new StringBuilder("Your accuracy: ");
        int correctCount = 0;

        speedGameSentences = speedGameSentences.trim().replaceAll("\s+", " ");
        sentence = sentence.trim().replaceAll("\s+", " ");

        String[] speedWords = speedGameSentences.split("\s+");
        String[] inputWords = sentence.split("\s+");

        int minWordCount = Math.min(speedWords.length, inputWords.length);

        for (int i = 0; i < minWordCount; i++) {
            String speedWord = speedWords[i];
            String inputWord = i < inputWords.length ? inputWords[i] : "";

            for (int j = 0; j < speedWord.length(); j++) {
                char speedChar = speedWord.charAt(j);
                char inputChar = j < inputWord.length() ? inputWord.charAt(j) : ' ';

                if (speedChar == inputChar || speedChar == '-' || inputChar == '-') {
                    result.append("\u001B[32m").append(speedChar).append("\u001B[0m");
                    correctCount++;
                } else {
                    result.append("\u001B[31m").append(speedChar).append("\u001B[0m");
                }
            }
            result.append(' ');
        }
        for (int i = minWordCount; i < speedWords.length; i++) {
            result.append("\u001B[31m").append('*').append("\u001B[0m").append(' ');
        }

        int totalCharactersInOriginal = speedGameSentences.replaceAll("\s+", "").length();

        System.out.println(result.toString().trim());
        System.out.println("Percentage accuracy: " + ((double) correctCount / totalCharactersInOriginal * 100) + "%");
    }

}