import java.util.Arrays;

public class exercise1 {

    public static void main(String[] args) {
        String array[] = {"Tennis", "Football", "Skating",
                "Jogging", "Basketball", "Baseball", "Curling", "Volleyball",
                "Cricket", "Badminton", "Squash", "Rugby"};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i].endsWith("ball")) {
                String replaced = array[i].replaceAll("ball", "orb");
                System.out.println(replaced);
            } else if (array[i].charAt(0) == 'C') {
                String replaced = array[i].replace('C', 'K');
                System.out.println(replaced);
            } else {
                String reformat = array[i].toLowerCase();
                System.out.println("Neo" + reformat);
            }
        }
    }
}
