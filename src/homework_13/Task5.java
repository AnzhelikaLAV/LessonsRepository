package homework_13;

public class Task5 {
    // Реализуйте метод sumOfArray (сумма элементов массива),
    // который получает на вход массив и определяет сумму его элементов.



        public static void main(String[] args) {
            int[] intArray = {1, 2, 3, 4, 5};
            double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5};

            System.out.println("Сумма элементов intArray: " + sumOfArray(intArray));
            System.out.println("Сумма элементов doubleArray: " + sumOfArray(doubleArray));
        }

        public static int sumOfArray(int[] array) {
            int sum = 0;
            for (int value : array) {
                sum += value;
            }
            return sum;
        }

        public static double sumOfArray(double[] array) {
            double sum = 0;
            for (double value : array) {
                sum += value;
            }
            return sum;
        }
    }


