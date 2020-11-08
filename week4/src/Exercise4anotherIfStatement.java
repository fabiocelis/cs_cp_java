import java.util.Random;
import java.util.Scanner;

public class Exercise4anotherIfStatement {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        String[] list = {"-", "+"};
        String operation = list[random.nextInt(list.length)];
        int firstPick = random.nextInt((50 - 5) + 1) + 5;
        int secontPick = random.nextInt((50 - 5) + 1) + 5;

        int result = (operation == "+" ) ? firstPick + secontPick : firstPick - secontPick;
        System.out.println(firstPick + " " + operation + " ? = " + result);
        System.out.println("Enter the missing number: ");
        int missingNumber = sc.nextInt();
        if (missingNumber == secontPick) {
            System.out.println("Congrats, you got the right answer!");
        } else {
            System.out.println("You got the wrong number :(, the right answer was: " + secontPick);
        }
    }
}
