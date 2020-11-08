import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select a number between 0 and 9999");
        int numberSelected = sc.nextInt();
        if (numberSelected < 0 || numberSelected > 9999){
            System.out.println("Invalid number.");
        } else if (numberSelected <= 9) {
            System.out.println("000" + numberSelected + ", and the number selected had 1 digit");
        } else if (numberSelected <= 99) {
            System.out.println("00" + numberSelected + ", and the number selected had 2 digits");
        } else if (numberSelected <= 999) {
            System.out.println("0" + numberSelected + ", and the number selected had 3 digits");
        } else {
            System.out.println(numberSelected + ", and the number selected had 4 digits");
        }
    }
}
