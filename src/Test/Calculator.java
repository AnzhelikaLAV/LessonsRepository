package Test;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        int num1 = scanner.nextInt();


        System.out.println("Введите 2 число: ");
        int num2 = scanner.nextInt();
        int res;
        System.out.println("Действие: ");
        String action = scanner.nextLine();
        action = scanner.nextLine();

        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.println("Результат: " + res);
                break;

            case "-":
                res = num1 - num2;
                System.out.println("Результат: " + res);
                break;

            case "*":
                res = num1 * num2;
                System.out.println("Результат: " + res);
                break;

            case "/":
                if (num2 == 0)
                    System.out.println("Error");
                else {
                    res = num1 / num2;
                    System.out.println("Результат: " + res);
                }
                break;
            default:
                System.out.println("Вы что-то не то ввели.");
        }
    }
}