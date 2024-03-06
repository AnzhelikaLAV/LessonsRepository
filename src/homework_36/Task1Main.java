package homework_36;

import java.util.Arrays;

public class Task1Main {
    public static void main(String[] args) {
        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};
        Arrays.sort(integers, new Task1.MyComparator());


        System.out.println(Arrays.toString(integers));

        Arrays.sort(integers, new Task2.MyComparator2());
        System.out.println(Arrays.toString(integers));
    }
}
