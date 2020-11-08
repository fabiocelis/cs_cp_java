import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your height in cm: ");
        double height = in.nextDouble();
        System.out.println("Enter your weight in kg: ");
        double weight = in.nextDouble();
        double bmi = weight / (Math.pow((height / 100), 2));
        //System.out.println(bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight, BMI of " + bmi);
        } else if (bmi < 25) {
            System.out.println("Normal, BMI of " + bmi);
        } else if (bmi < 30) {
            System.out.println("Overweight, BMI of " + bmi);
        } else {
            System.out.println("Obese, BMI of " + bmi);
        }
    }
}
