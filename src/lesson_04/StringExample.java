package lesson_04;

public class StringExample {
    public static void main(String[] args) {
        String name = "Сигизмунд"; // объявление и инициализация переменной типа String

       String name2 = new String (" Hello"); // Создание новой строки с помощью конструктора класса

        // длина строки

        System.out.println(name.length()); // получить длину нашей строки
        int lenght = name.length(); // позже, когда будем учить методы
        System.out.println(lenght);

        // привести все символы к верхнему регистру
        System.out.println(name.toUpperCase());
        System.out.println(name);

        // привести все символы в нижний регистр
        System.out.println(name.toLowerCase());
        System.out.println("name: " + name);
    }
}
