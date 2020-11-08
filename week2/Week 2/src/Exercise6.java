public class Exercise6 {
    public static void main(String[] args) {
        double xa = -5.5;
        double ya = 2;
        double xb = -3;
        double yb = -2.2;
        double xc = 1;
        double yc = 2;
        double xd = 7;
        double yd = 4.6;
        double distanceAB = Math.sqrt(Math.pow((xb - xa),2) + Math.pow((yb - ya), 2));
        double distanceBC = Math.sqrt(Math.pow((xc - xb),2) + Math.pow((yc - yb), 2));
        double distanceCD = Math.sqrt(Math.pow((xd - xc),2) + Math.pow((yd - yc), 2));
        double sum = distanceAB + distanceBC + distanceCD;
        System.out.println(distanceAB);
        System.out.println(distanceBC);
        System.out.println(distanceCD);
    }
}
