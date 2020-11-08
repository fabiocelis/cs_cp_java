import java.util.Scanner;
import java.util.Arrays;

public class Exercise2DonalMongey {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int day, month, year;
        System.out.println("Enter a day: ");
        day = in.nextInt();
        System.out.println("Enter a month: ");
        month = in.nextInt();
        System.out.println("Enter a year: ");
        year = in.nextInt();

        int[] shortMonths = {4, 6, 9, 11};
        int[] longMonths = {1, 3, 5, 7, 8, 10, 12};

        String answer = "";

        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? true : false;

        if (Arrays.stream(shortMonths).anyMatch(i -> i == month)) answer = (day > 1 && day <= 30) ? "Yes" : "No";
        else if (Arrays.stream(shortMonths).anyMatch(i -> i == month)) answer = (day > 1 && day <= 31) ? "Yes" : "No";
        else if (month == 2 && leapYear) answer = (day > 1 && day <= 29) ? "Yes" : "No";
        else if (month == 2) answer = (day > 1 && day <= 28) ? "Yes" : "No";
        else answer = "No";

        System.out.println(answer);
    }
}

