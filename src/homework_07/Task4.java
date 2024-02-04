package homework_07;

public class Task4 {
    // Распечатать только 7 чисел от 1 до 100, которые делятся на 5 без остатка. Используем цикл while


    public static void main(String[] args) {
        int number = 1; // счетчики цикла общепринято называть i, j, k
        int quantity = 0;

        while (number <= 100 && quantity < 7) { //true && true
            if (number % 5 == 0) {
                System.out.println(number);
                quantity++;
            }
            number++;
        }
    }
}




