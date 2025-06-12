package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int attemptCount = 3;

        Guess guessName = new Guess("Guess my name!!!!", "Hlulani", "Phume", "DeeCoder", "Tshimo", "Anonymous" );
        guessName.display();

        Scanner scanInput = new Scanner(System.in);

        while (attemptCount > 0) {
            System.out.println("Enter a name:");
            String answer = scanInput.nextLine();

            if (guessName.compareAnswer(answer)) {
                System.out.println("Correct! Well done WINNER!");
                break;
            } else {
                attemptCount--;
                if (attemptCount > 0) {
                    System.out.println("Wrong LOSER! Try again. You have " + attemptCount + " attempt/s left.");
                    guessName.display();
                } else {
                    System.out.println("You've run out of attempts. LOSER");
                }
            }
        }

        scanInput.close();
    }
}

