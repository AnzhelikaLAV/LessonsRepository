package homework_08;
import java.util.Arrays;
public class Task3 {
    // Дан массив целых чисел. *Выберите произвольную длину. Заполните случайными значениями.
    //
    //Вывести на экран:
    //
    //минимальное значение, хранящееся в массиве
    //максимальное
    //среднее арифметическое всех значений в массиве
        public static void main(String[] args) {

            int[] array = {15, 8, 32, 4, 12, 6, 20};


            int min = Arrays.stream(array).min().orElseThrow();

            // Находим максимальное значение
            int max = Arrays.stream(array).max().orElseThrow();

            // Находим среднее арифметическое
            double average = Arrays.stream(array).average().orElseThrow();

            // Выводим результаты
            System.out.println("Minimum value: " + min);
            System.out.println("Maximum value: " + max);
            System.out.println("Average value: " + average);
        }
    }



