package homework_12;

import java.util.Arrays;

public class Task3{

//  Написать свой метод copyOfArray, дублирующий функционал метода Arrays.copyOf()
//
//на вход принимает массив целых чисел и число - длину нового массива.
// Метод должен создать и распечатать массив заданной в параметрах длинны.
// В начало массива должны быть скопированы элементы из входящего массива:
//
//{0, 1, 2, 3, 4 , 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}


    public static void copyOfArray(int[] inputArray, int newLength) {
        if (newLength <= 0) {
            System.out.println("Wrong input");
            return;
        }

        int[] newArray = Arrays.copyOf(inputArray, newLength);
        System.out.println( "Copied: " + Arrays.toString(newArray));
    }

    public static void main(String[] args) {
        int[] array = {5, 3, -2, 7, 9, 3, 8};
        copyOfArray(array, 5);
    }
}






