import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o grau em celsius: ");
        int c = in.nextInt();
        int d = c + 62;
        System.out.println(d);
        double a = 165.5;
        double b = 102.75;
        double perimeter = (a * 2) + (b * 2);
        System.out.println("The perimeter of the rectangle is : " + perimeter);
    }
}
