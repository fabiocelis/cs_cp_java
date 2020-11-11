package application;

import java.util.Arrays;
import java.util.Random;

public class Exercise2_SecondResolution {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt((1000 - 1) + 1) + 1;
        }
        System.out.println(Arrays.toString(array));

        int largest = array[0];
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            } else if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count += array[i];
        }
        int average = count / 20;
        System.out.println("The average is: " + average);
    }
}
