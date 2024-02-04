package homework_08;

public class Task1 {
    // Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while


        public static void main(String[] args) {
            int i = 1;

            do {
                if (i % 5 == 0) {
                    System.out.println(i);
                }

                i++;
            } while (i <= 100);
        }
    }


