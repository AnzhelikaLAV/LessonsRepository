package homework_36;
import java.util.Arrays;
import java.util.Comparator;


public class Task1 {
    //Task 1
    //Напишите MyComparator, реализующий Comparator с методом сравнения для сортировки массива
    // целых чисел в следующем порядке: Четные целые числа должны идти перед нечетными числами
    //Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
    //[2, 4, 6, 8, 1, 3, 5, 7, 7, 9] // Outpur

    public static class MyComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer num1, Integer num2) {

            if (num1 % 2 == 0 && num2 % 2 != 0) {
                return -1;
            } else if (num1 % 2 != 0 && num2 % 2 == 0) {
                return 1;
            } else {
                return num1.compareTo(num2);
            }
        }

    }
}
