import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a single character from the alphabet: ");
        String alphabetCharacter = sc.next().toUpperCase();
        char letter = alphabetCharacter.charAt(0);
        int asciiValue = letter;
        if (alphabetCharacter.length() > 1){
            System.out.println("Only one character is accepted");
        } else if (asciiValue >= 65 && asciiValue <= 90) {
            if (asciiValue == 65 || asciiValue == 69 || asciiValue == 73 || asciiValue == 79 || asciiValue == 85) {
                System.out.println("The letter " + letter + " is a Vowel.");
            } else {
                System.out.println("The letter " + letter + " is a Consonant.");
            }
        } else {
            System.out.println("That's not a valid statement.");
        }
    }
}
