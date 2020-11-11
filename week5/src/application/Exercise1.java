package application;

import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt((100 - 1) + 1) + 1;
        System.out.println(randomNumber);

        System.out.println("Guess the integer random generated number between 1 and 100: ");
        int guessNumber = sc.nextInt();
        int count = 0;
        while (randomNumber != guessNumber && count < 10) {
            if (guessNumber > randomNumber && (guessNumber - randomNumber) > 50) {
                System.out.println("Your number is much higher then the random number");
                System.out.println("Give another try: ");
                guessNumber = sc.nextInt();
            } else if (guessNumber > randomNumber && (randomNumber -  guessNumber) <= 50) {
                System.out.println("Your number is higher then the random number");
                System.out.println("Give another try: ");
                guessNumber = sc.nextInt();
            } else if (guessNumber < randomNumber && (randomNumber -  guessNumber) > 50) {
                System.out.println("Your number is much lower then the random number");
                System.out.println("Give another try: ");
                guessNumber = sc.nextInt();
            } else if (guessNumber < randomNumber && (randomNumber -  guessNumber) <= 50) {
                System.out.println("Your number is lower then the random number");
                System.out.println("Give another try: ");
                guessNumber = sc.nextInt();
            }
            count += 1;
            if (count == 10) {
                System.out.println("You have passed the 10 turns to try.");
            }
        }
        if (randomNumber == guessNumber) {
            System.out.println("I guessed the right number! Congratulations!");
        }

        sc.close();
    }
}
