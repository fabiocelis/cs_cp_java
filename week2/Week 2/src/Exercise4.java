public class Exercise4 {
    public static void main(String[] args) {
        int normalYears = 100 - 25;
        int leapYears = 25;
        int numberOfDays = (normalYears * 365) + (leapYears * 366);
        System.out.println("The number os days in the 21 century is: " + numberOfDays);
    }
}
