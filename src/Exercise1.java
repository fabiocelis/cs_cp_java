import java.util.Scanner;

import static java.lang.Math.*;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the diameter of a cone: ");
        double diameter = in.nextDouble();
        System.out.println("Enter the height of the cone: ");
        double height = in.nextDouble();
        double slatHeight = sqrt((pow(diameter/2.0,2) + pow(height, 2)));
        //System.out.println(diameter +" "+height+" "+" "+slatHeight);
        double surfaceArea = PI * (pow(diameter/2.0, 2)) + PI * (diameter/2.0) * slatHeight;
        System.out.println("The surface area of the cone is: " + surfaceArea);
    }
}
