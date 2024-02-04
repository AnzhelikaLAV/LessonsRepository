package homework_04;

public class Homework04 {
   //Напишите программу на Java, которая преобразует ваше имя,
    // записанное маленькими буквами, в верхний регистр.
    // Для каждой буквы имени создайте отдельную переменную типа char,
    // инициализированную соответствующей буквой в нижнем регистре.
    // Затем преобразуйте каждую букву в верхний регистр, используя арифметические операции,
    // и выведите результат.

    public static void main(String[] args) {

        String name = "anzhelika";
        System.out.println(name.toUpperCase());

      /*  char ch1 = 'a';
        char ch2 = 'n';
        char ch3 = 'z';
        char ch4 = 'h';
        char ch5 = 'e';
        char ch6 = 'l';
        char ch7 = 'i';
        char ch8 = 'k';
        char ch9 = 'a';

        ch1 = Character.toUpperCase(ch1);
        ch2 = Character.toUpperCase(ch2);
        ch3 = Character.toUpperCase(ch3);
        ch4 = Character.toUpperCase(ch4);
        ch5 = Character.toUpperCase(ch5);
        ch6 = Character.toUpperCase(ch6);
        ch7 = Character.toUpperCase(ch7);
        ch8 = Character.toUpperCase(ch8);
        ch9 = Character.toUpperCase(ch9);

        System.out.println(ch1 + "" + ch2 + "" + ch3 + "" + ch4  + "" + ch5 + "" + ch6 + "" + ch7 + "" + ch8 + "" +ch9);
*/
        char ch1 = 'a';
        char ch2 = 'n';
        char ch3 = 'z';
        char ch4 = 'h';
        char ch5 = 'e';
        char ch6 = 'l';
        char ch7 = 'i';
        char ch8 = 'k';
        char ch9 = 'a';


        ch1 = (char) (ch1 - 'a' + 'A');
        ch2 = (char) (ch2 - 'a' + 'A');
        ch3 = (char) (ch3 - 'a' + 'A');
        ch4 = (char) (ch4 - 'a' + 'A');
        ch5 = (char) (ch5 - 'a' + 'A');
        ch6 = (char) (ch6 - 'a' + 'A');
        ch7 = (char) (ch7 - 'a' + 'A');
        ch8 = (char) (ch8 - 'a' + 'A');
        ch9 = (char) (ch9 - 'a' + 'A');

        System.out.println(ch1 + "" + ch2 + "" + ch3 + "" + ch4 + "" + ch5 + "" + ch6 + "" + ch7 + "" + ch8 + "" + ch9);
    }
}

///*
//Напишите программу на Java, которая преобразует ваше имя, записанное маленькими буквами, в верхний регистр.
//Для каждой буквы имени создайте отдельную переменную типа char, инициализированную соответствующей буквой в нижнем регистре.
//Затем преобразуйте каждую букву в верхний регистр, используя арифметические операции, и выведите результат.
// */
//public class HW04_Task1 {
//    public static void main(String[] args) {
//        char ch1 = 'h';
//        char ch2 = 'a';
//        char ch3 = 'n';
//        char ch4 = 'n';
//        char ch5 = 'a';

//        System.out.println("До: " + ch1);
//        // Ваш код
////        ch1 = (char) (ch1 - 32);
//        ch1 -= 32; // ch1 = ch1 - 32;
//        System.out.println("После: " + ch1);
//        ch2 -= 32;
//        ch3 -= 32;
//        ch4 -= 32;
//        ch5 -= 32;

//        System.out.print(ch1);
//        System.out.print(ch2);
//        System.out.print(ch3);
//        System.out.print(ch4);
//        System.out.println(ch5);
////        System.out.printf("%d", 1);
//        System.out.println("" + ch1 + ch2 + ch3 + ch4 + ch5);
