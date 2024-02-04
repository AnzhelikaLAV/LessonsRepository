package homework_06;
import java.util.Scanner;
public class Task0 {


    /*
    Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
    а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3
    */
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите число 1, 2 или 3");
            int input = scanner.nextInt();

            if (input == 1) {
                System.out.println("Вы ввели число один");
            } else if (input == 2) {
                System.out.println("Вы ввели число два");
            } else if (input == 3) {
                System.out.println("Вы ввели число три");
            } else {
                System.out.println("Вы ввели какое-то другое число");
            }


        }
    }

