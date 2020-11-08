import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise3 {
    public static void main(String[] args) {
        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");

        Date x1 = new Date(System.currentTimeMillis());

        System.out.println(x1 + "\n");
        System.out.println(sdf1.format(x1));
    }
}
