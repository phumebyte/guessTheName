package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int attemptCount = 0;

        Guess guessName = new Guess("Guess my name!!!!", "Hlulani", "Phume", "DeeCoder", "Tshimo", "Anonymous", "Anonymous");
        guessName.display();

        System.out.println("Enter a name!!!");

        Scanner scanInput = new Scanner(System.in);
        String answer = scanInput.nextLine();

        while (!guessName.compareAnswer(answer)){
            attemptCount++;
            System.out.println("WRONG! Try again, LOSER");
            guessName.display();
            answer = scanInput.nextLine();
            guessName.compareAnswer(answer);
            System.out.println(attemptCount);
        }
        scanInput.close();
    }
}

