package homework_36;
import java.util.Arrays;
import java.util.Comparator;

public class Task2 {
    // Напишите MyComparator2 с методом сравнения для сортировки массива целых чисел в следующем порядке:
    //Четные целые числа должны идти перед нечетными числами в порядке возрастания.
    //Нечетные целые числа должны идти после четных в порядке убывания
    //Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
    //[2, 4, 6, 8, 9, 7, 7, 5, 3, 1] // Output



    public static class MyComparator2 implements Comparator<Integer> {

        @Override
        public int compare(Integer num1, Integer num2) {

            if (num1 % 2 == 0 && num2 % 2 == 0) {
                return num1.compareTo(num2);
            } else if (num1 % 2 != 0 && num2 % 2 != 0) {
                return num2.compareTo(num1);
            } else if (num1 % 2 == 0 && num2 % 2 != 0) {
                return -1;
            } else {
                return 1;
            }
        }
}
}
