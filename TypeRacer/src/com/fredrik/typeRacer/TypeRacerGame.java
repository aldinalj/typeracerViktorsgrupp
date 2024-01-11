package com.fredrik.typeRacer;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TypeRacerGame {

    Scanner scanner = new Scanner(System.in);

    boolean gamePlaying = true;

    Accuracy accuracy = new Accuracy();

    public void startGame(String sentence) {
        // TODO: Refine this method
        System.out.println("""
                                
                ░██╗░░░░░░░██╗███████╗██╗░░░░░░█████╗░░█████╗░███╗░░░███╗███████╗  ████████╗░█████╗░
                ░██║░░██╗░░██║██╔════╝██║░░░░░██╔══██╗██╔══██╗████╗░████║██╔════╝  ╚══██╔══╝██╔══██╗
                ░╚██╗████╗██╔╝█████╗░░██║░░░░░██║░░╚═╝██║░░██║██╔████╔██║█████╗░░  ░░░██║░░░██║░░██║
                ░░████╔═████║░██╔══╝░░██║░░░░░██║░░██╗██║░░██║██║╚██╔╝██║██╔══╝░░  ░░░██║░░░██║░░██║
                ░░╚██╔╝░╚██╔╝░███████╗███████╗╚█████╔╝╚█████╔╝██║░╚═╝░██║███████╗  ░░░██║░░░╚█████╔╝
                ░░░╚═╝░░░╚═╝░░╚══════╝╚══════╝░╚════╝░░╚════╝░╚═╝░░░░░╚═╝╚══════╝  ░░░╚═╝░░░░╚════╝░
                                
                ████████╗██╗░░░██╗██████╗░███████╗██████╗░░█████╗░░█████╗░███████╗██████╗░██╗
                ╚══██╔══╝╚██╗░██╔╝██╔══██╗██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔════╝██╔══██╗██║
                ░░░██║░░░░╚████╔╝░██████╔╝█████╗░░██████╔╝███████║██║░░╚═╝█████╗░░██████╔╝██║
                ░░░██║░░░░░╚██╔╝░░██╔═══╝░██╔══╝░░██╔══██╗██╔══██║██║░░██╗██╔══╝░░██╔══██╗╚═╝
                ░░░██║░░░░░░██║░░░██║░░░░░███████╗██║░░██║██║░░██║╚█████╔╝███████╗██║░░██║██╗
                ░░░╚═╝░░░░░░╚═╝░░░╚═╝░░░░░╚══════╝╚═╝░░╚═╝╚═╝░░╚═╝░╚════╝░╚══════╝╚═╝░░╚═╝╚═╝
                """);

        System.out.println("""
                Press 1 to begin playing!
                Press 2 to exit :(
                """);

        // THE GAME
        do {
            switch (scanner.nextLine()) {
                case "1" -> {

                    long startTime = System.nanoTime();

                    System.out.println("""
                            Starting Game!
                                                        
                                                        
                            Type the following sentence as fast as you can:
                            """);
                    System.out.println(sentence);

                    String userInput = scanner.nextLine();
                    long endTime = System.nanoTime();



                    long duration = (endTime - startTime);
                    long convert = TimeUnit.SECONDS.convert(duration, TimeUnit.NANOSECONDS);

                    Accuracy.showCorrectStatistics(sentence, userInput);
                    System.out.println("It took you " + (convert) + " seconds");



                }
                case "0" -> {
                    System.out.println("Thanks for playing!");
                    gamePlaying = false;
                }

                default -> System.out.println("Press 1 or 0!");
            }

            System.out.println("""
                                        
                    Play again? just Press: 1!
                    Press: 0 for exit!
                    """);

        } while (gamePlaying == true);
    }
}

