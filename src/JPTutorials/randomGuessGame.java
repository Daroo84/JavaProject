package JPTutorials;

import java.util.Scanner;

public class randomGuessGame {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int correctAnswer = (int)Math.ceil(Math.random()*10);


        int numberOfGuesses = 3;
        int userGuess = 0;

        System.out.println("You have 3 guessed from 1 to 10");

        while(numberOfGuesses > 0) {
            System.out.println("Enter your guess: ");

            userGuess = myScan.nextInt();

            if(userGuess == correctAnswer) {
                System.out.println("You have WON guess of " +userGuess);
                break;
            } else if(numberOfGuesses == 1) {
                System.out.println("You lose. the correct answer was " +correctAnswer);
            } else {
                System.out.println("Wrong answer, try again.");
            }

            numberOfGuesses--;
        }


    }

}
