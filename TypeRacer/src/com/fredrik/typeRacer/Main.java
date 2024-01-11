package com.fredrik.typeRacer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SentenceGenerator sentenceGenerator = new SentenceGenerator();

        TypeRacerGame typeRacerGame = new TypeRacerGame();

        // This is where the game starts
        typeRacerGame.startGame(sentenceGenerator.getRandomSentence());







    }
}