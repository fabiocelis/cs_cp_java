import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Type a Integer: ");
        int integer = in.nextInt();
        if (integer > 0) {
            System.out.println("This integer is posite.");
        } else if (integer < 0) {
            System.out.println("This integer is negative.");
        } else {
            System.out.println("This integer is Zero");
        }
    }
}
