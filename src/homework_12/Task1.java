package homework_12;

// Написать метод, принимающий на вход массив строк.
// Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.

import java.util.Arrays;

public class Task1 {

        public static String[] shortestAndLongestStrings(String[] inputArray) {
            if (inputArray == null || inputArray.length == 0) {
                return new String[0]; // Возвращаем пустой массив в случае пустого входного массива
            }

            String shortest = inputArray[0];
            String longest = inputArray[0];

            for (String str : inputArray) {
                if (str.length() < shortest.length()) {
                    shortest = str;
                }

                if (str.length() > longest.length()) {
                    longest = str;
                }
            }

            return new String[]{shortest, longest};
        }

        public static void main(String[] args) {
            String[] inputArray = {"anna", "apple", "artem", "anastasia", "strawberry"};

            String[] result = shortestAndLongestStrings(inputArray);

            System.out.println("Original Array: " + Arrays.toString(inputArray));
            System.out.println("Shortest and Longest Strings: " + Arrays.toString(result));
        }
    }


