import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day: ");
        int day = sc.nextInt();
        System.out.println("Enter a month: ");
        int month = sc.nextInt();
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        boolean isLeapYear = false;
        System.out.println(day + ", " + month + ", " + year);

        if (day > 31 || month > 12) {
            System.out.println("No.");
        } else if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                    if (isLeapYear && month == 2 && day <= 29) {
                        System.out.println("Yes.");
                    } else {
                        System.out.println("No.");
                    }
                }
            } else isLeapYear = true;
            {
                if (isLeapYear && month == 2 && day <= 29) {
                    System.out.println("Yes.");
                } else {
                    System.out.println("No.");
                }
            }
        }
        else if (month == 2 && day > 28) {
            System.out.println("No.");
        } else if (month == 4 && day > 30 || month == 6 && day > 30 || month == 9 && day > 30 || month == 11 && day > 30) {
            System.out.println("No.");
        } else {
            System.out.println("Yes.");
        }
    }
}


