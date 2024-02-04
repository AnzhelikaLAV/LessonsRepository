package homework_08;

public class Task5 {
    // Дан массив строк. Вывести на экран все символы из самой длинной строки массива
    //
    //{ “One”, “Two”, “Twenty” } -->
    //
    //T
    //w
    //e
    //n
    //t
    //y
        public static void main(String[] args) {
            // Задаем массив строк
            String[] строки = {"One", "Two", "Twenty"};

            // Находим самую длинную строку в массиве
            String самаяДлинная = "";
            for (String строка : строки) {
                if (строка.length() > самаяДлинная.length()) {
                    самаяДлинная = строка;
                }
            }

            // Выводим на экран все символы из самой длинной строки
            System.out.println("Символы из самой длинной строки:");

            for (int i = 0; i < самаяДлинная.length(); i++) {
                System.out.println(самаяДлинная.charAt(i));
            }
        }
    }


