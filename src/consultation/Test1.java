package consultation;
/* # Алгоритм для решения задач по программированию

**Шаг 1.**
Что дано?
Выписать перед глазами все, что дано в задаче, продумать типы и имена необходимых переменных.

**Шаг 2**
Что нужно сделать?
Выписать перед глазами все, что нужно найти или сделать в рамках задачи.
Продумать типы и имена необходимых переменных, продумать возможные необходимые методы.

**Шаг 3.**
Как это уже решали?
Найти фрагменты похожего кода, решения похожих задач от которых можно оттолкнуться и решить "по аналогии" свою задачу.

**Шаг 4.**
Какой самый важный, сложный момент в задаче?
Продумать, написать по шагам ключевой алгоритм, который позволяет решить поставленную задачу.

**Шаг 5.**
Как будет работать программа?
Продумать интерфейс взаимодействия с пользователем.*/


import java.sql.Array;

// Распечатать все числа от 1 до 100 кратные 5
public class Test1 {
    public static void main(String[] args) {
        /* дан пустой массив, его длина 100 ячеек. Нужно заполнить целыми числами от1 до 100.
        Используем цикл For
        Создаем переменную int x = 1, на каждом шагу цикла x увеличивается на единицу.
        Если x % 5 == 0, тогда будем печатать i текущий элемент массива
        Все эти элементы попадают в массив.
        Выводим на экран на каждом шагу цикла
         */

        int[] array = new int[100];

        int x = 1;

        for (int i = 0; i < array.length; i++) {
            array[i] = x; // array[i] - это текущий элемент массива!!!
            x++;
            System.out.println("Вывод: " + array[i] );
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 5 == 0){
                System.out.println(array[i]);
            }
        }
        }



}