package consultation;

import java.lang.reflect.Array;
import java.util.Random;

/* **Task 3**
Дан массив целых чисел. *Выберите произвольную длину. Заполните случайными значениями.

Вывести на экран:
- минимальное значение, хранящееся в массиве
- максимальное
- среднее арифметическое всех значений в массиве */
public class Test2 {
    // Дано массив целых чисел.
    // Нужно заполнить массив случайными значениями
    // Нужно найти минимальное значение, максимальное, среднее арифметическое
    // Вывести на экран

    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[10]; // 10 длина массива

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) +1; // bound - диапазон; +1 чтобы начать от единицы
            System.out.println(array[i]);
        }

        int min, max, average;

        min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i]< min){
                min = array[i];

            }

        }

        System.out.println("Минимальное начение: " + min );

        max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i]> max){
                max = array[i];

            }

        }

        System.out.println("Максимальное значение: " + max);

        double sum = 0;

        for (int i = 0; i < array.length; i++) {

            sum += array[i];

        }

        System.out.println("Среднее арифметическое: " + sum / array.length);


    } // это конец main


}
