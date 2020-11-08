import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the x coordinate of A:");
        double xA = in.nextDouble();
        System.out.println("Enter the y coordinate of A:");
        double yA = in.nextDouble();
        System.out.println("Enter the x coordinate of B:");
        double xB = in.nextDouble();
        System.out.println("Enter the y coordinate of B:");
        double yB = in.nextDouble();
        System.out.println("Enter the x coordinate of C:");
        double xC = in.nextDouble();
        System.out.println("Enter the y coordinate of C:");
        double yC = in.nextDouble();

        double dotProductVectorAB = (xA * yB) + (xB * yA);
        double vectorMagnitudeA = Math.sqrt(Math.pow((xA + yA), 2));
        double vectorMagnitudeB = Math.sqrt(Math.pow((xB + yB), 2));
        double angleAB = Math.toDegrees(Math.cos(dotProductVectorAB / (vectorMagnitudeA * vectorMagnitudeB)));

        double dotProductVectorBC = (xB * yC) + (xC * yB);
        double vectorMagnitudeC = Math.sqrt(Math.pow((xC + yC), 2));
        double angleBC = Math.toDegrees(Math.cos(dotProductVectorBC / (vectorMagnitudeB * vectorMagnitudeC)));

        System.out.println("The angle between A and B is: " + angleAB);
        System.out.println("The angle between B and C is: " + angleBC);

    }
}
