package homework_12;
// Написать метод, принимающий на вход массив строк.
// Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.

public class Task1_1 {
    public static void main(String[] args) {

        String[] strings = {"One", "Java", "Python", "butterfly", "js"};
        System.out.println("============ Without null ==========");

        String[] res = arraySmallestAndLongestStrings(strings);
        printArray(res);
        System.out.println("\n============ testArray = null ==========");


        String[] testArray = null;
        res = arraySmallestAndLongestStrings(testArray);
        printArray(res);

        System.out.println("\n============ null in array ==========");

        testArray = new String[]{"One", "Java", null, "Python", "butterfly", "js"};
        res = arraySmallestAndLongestStrings(testArray);
        printArray(res);


        System.out.println("\n============ First null in array ==========");

        testArray = new String[]{null, "One", "Java", "Python", "butterfly", "js"};
        res = arraySmallestAndLongestStrings(testArray);
        printArray(res);

        System.out.println("\n============ All null in array ==========");
        testArray = new String[]{null, null, null, null, null, null};
        res = arraySmallestAndLongestStrings(testArray);
        printArray(res);

    }


    public static String[] arraySmallestAndLongestStrings(String[] strings) {
        // Проверить, на null ссылку strings (а существует ли обьект массива)
        // Надо найти строку наим и наибольшей длины
        // Создать массив из двух строк. Записать туда найденные строки и вернуть

        // Проблема null
        /* 1. Если у нас нет null. Ссылка на массив - ок, все элементы в массиве не null
        Алгоритм будет корректно работать

        2. Если ссылка на массив = null -> Мы возвращаем новый массив, заполненный значением по умолчанию (null)
        {"", ""} null, null

        3. Если в массиве присутствует элемент со значением null - нам надо обработать эту ситуацию. Иначе при попытке
        получить длину такого элемента мы получим NPE (ошибка-null pointer exception)
         */
        if (strings == null) {
            return new String[2]; // {null, null}
        }

        String minLen = findNotNullValue(strings);
        String maxLen = strings[0];

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null && minLen != null && minLen.length() > strings[i].length()) {
                minLen = strings[i];
            }

            if (strings[i] != null && maxLen != null && maxLen.length() < strings[i].length()) {
                maxLen = strings[i];
            }
        }

        return new String[]{minLen, maxLen};
    }

    public static String findNotNullValue(String[] strings) {

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                return strings[i];
            }
        }
        return null;
    }
    public static void printArray(String[] strings) {
        System.out.print("[");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ((i < strings.length - 1) ? ";" : "]\n"));
        }
    }
}









