package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercise2 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList();
        for (int i = 1; i <= 20; i++) {
            int randomNumber = random.nextInt((1000 - 1) + 1) + 1;
            list.add(randomNumber);
        }
        System.out.println(list);

        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        Integer largestNumber = Collections.max(list);
        Integer smallestNumber = Collections.min(list);
        System.out.println("The largest number is : " + largestNumber);
        System.out.println("The smallest number is : " + smallestNumber);
        System.out.println("The average is : " + (sum / 20));
    }
}
