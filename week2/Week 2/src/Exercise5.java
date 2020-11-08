public class Exercise5 {

    public static void main(String[] args) {
        double volume = Math.pow(7.0/2, 2) * Math.PI * 10.5;
        double rectangularWrapper = 7 * 10.5;
        double completeWrapp = rectangularWrapper + (Math.PI * 7.0/2);
        System.out.println(volume +", " + rectangularWrapper+", "+completeWrapp);
    }
}
