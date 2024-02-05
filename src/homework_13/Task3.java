package homework_13;

public class Task3 {

// Написать метод по поиску строки в массиве строк. На вход метод принимает массив строк, и строку для поиска.
        public static void main(String[] args) {
            String[] stringArray = {"apple", "banana", "cherry", "date", "Strowberry"};

            String searchString = "date";
            int resultIndex = findString(stringArray, searchString);

            if (resultIndex != -1) {
                System.out.println("Строка '" + searchString + "' найдена в массиве по индексу " + resultIndex);
            } else {
                System.out.println("Строка '" + searchString + "' не найдена в массиве");
            }
        }

        public static int findString(String[] array, String searchString) {
            if (array == null || searchString == null) {
                System.out.println("Некорректные входные данные");
                return -1;
            }

            for (int i = 0; i < array.length; i++) {
                if (searchString.equals(array[i])) {
                    return i;
                }
            }

            return -1;
        }
    }


