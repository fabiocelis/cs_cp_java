import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Calculating Taxes");
        System.out.println("Choose an option below: ");
        System.out.println("1.  Single\n2.  Single with Child\n3.  Married.");
        System.out.print("Your option: ");
        int option = in.nextInt();

        System.out.println("How much you earned this month? : ");
        double monthEars = in.nextDouble();

        if (option == 1) {
            //tax band 35.300 per year = 2941.66 per month
            double monthEarsSingle = (35300.0/12);
            double taxSingle = monthEarsSingle * 0.2;
            if (monthEars > monthEarsSingle) {
                double extraTaxSingle = (monthEars - monthEarsSingle) * 0.4;
                double totalTaxSingle = taxSingle + extraTaxSingle;
                System.out.println("You will need to pay " + taxSingle + " plus " + extraTaxSingle + " extra, total of " + totalTaxSingle + " on taxes");
            } else {
                System.out.println("You need to pay " + taxSingle + " on taxes.");
            }
        }
        if (option == 2) {
            //tax band 39.300 per year = 3275 per month
            double monthEarsSingleChild = (39300.0/12);
            double taxSingleChild = monthEarsSingleChild * 0.2;
            if (monthEars > monthEarsSingleChild) {
                double extraTaxSingleChild = (monthEars - monthEarsSingleChild) * 0.4;
                double totalTaxSingleChild = taxSingleChild + extraTaxSingleChild;
                System.out.println("You will need to pay " + taxSingleChild + " plus " + extraTaxSingleChild + " extra, total of " + totalTaxSingleChild + " on taxes");
            } else {
                System.out.println("You need to pay " + taxSingleChild + " on taxes.");
            }
        }
        if (option == 3) {
            //tax band 44.300 per year = 3691.66 per month
            double monthEarsMarried = (44300.0/12);
            double taxMarried = monthEarsMarried * 0.2;
            if (monthEars > monthEarsMarried) {
                double extraTaxMarried = (monthEars - monthEarsMarried) * 0.4;
                double totalTaxMarried = taxMarried + extraTaxMarried;
                System.out.println("You will need to pay " + taxMarried + " plus " + extraTaxMarried + " extra, total of " + totalTaxMarried + " on taxes");
            } else {
                System.out.println("You need to pay " + taxMarried + " on taxes.");
            }
        }

    }
}
