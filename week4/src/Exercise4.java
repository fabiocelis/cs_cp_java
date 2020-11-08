import java.util.Random;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        String[] list = {"-", "+"};
        String operation = list[random.nextInt(list.length)];
        int firstPick = random.nextInt((50 - 5) + 1) + 5;
        int secontPick = random.nextInt((50 - 5) + 1) + 5;

        if (operation == "+") {
            int result = firstPick + secontPick;
            System.out.println(firstPick + " + ? = " + result);
            System.out.println("Enter the missing number: ");
            int missingNumber = sc.nextInt();
            if (missingNumber == secontPick) {
                System.out.println("Congrats, you got the right answer!");
            } else {
                System.out.println("You got the wrong number :(, the right answer was: " + secontPick);
            }
        } else if (operation == "-") {
            int result = firstPick - secontPick;
            System.out.println(firstPick + " - ? = " + result);
            System.out.println("Enter the missing number: ");
            int missingNumber = sc.nextInt();
            if (missingNumber == secontPick) {
                System.out.println("Congrats, you got the right answer!");
            } else {
                System.out.println("You got the wrong number :(, the right answer was: " + secontPick);
            }
        }
    }
}
