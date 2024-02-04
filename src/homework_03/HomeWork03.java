package homework_03;

public class HomeWork03 {
    public static void main(String[] args) {
        // Задача 0

        /*
     В классе HomeWork03.java задекларировать (объявить) и присвоить значения 3-м переменным.
     Правильно подберите имя переменным и выберите тип.
     Переменная 1 - Ваше имя
     Переменная 2 - сколько Вам полных лет
     Переменная 3 - должна хранить стоимость 1 литра молока в Вашей стране (без наименования валюты - только цена)
        */

        String name = "Anzhelika";

        int age = 41;

        double priceMilk = 1.20;

        System.out.println(name + "\n" + age + "\n" + priceMilk);

        // Задача 1

        /*
     Объявите 10 переменных типа int со значениями 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
     Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 10.
     Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
     Распечатайте её через println. Сколько программа отбросила в дробной части?
        */

        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int e = 4;
        int f = 5;
        int g = 6;
        int h = 7;
        int i = 8;
        int j = 9;

        int countVariables = 10;

        // int result = (a + b + c + d + e + f + g + h + i + j) / 10;
        int sum = a + b + c + d + e + f + g + h + i + j;

        System.out.println("sum: " + sum);

        int average = sum / countVariables;
        System.out.println("average: " + average );

        //есть два пути
        double averageDouble = (double) sum / countVariables;
        System.out.println("averageDouble: " + averageDouble);

        int rest = (int) ((averageDouble - average) * countVariables);
        System.out.println("rest: " + rest);

        rest = sum % countVariables;
        System.out.println("rest: " + rest);





        // Задача 2

        /*
        Пусть цена товара A обычно составляет 1000 Euro, и товара B составляет 500 Euro.
        Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.
        Выведите на экран переменную, которая соответствует стоимости суммы A+B со скидкой.
        Отдельно выведите на экран сумму скидки от этой покупки (в деньгах).
        */

        double A = 1000;

        double B = 500;

        int discount = 10;

        //скидка в деньгах
        double discountMoney = (A + B) * discount / 100;
        System.out.println("discountMoney: " + discountMoney);

        //два варианта
        double priceWithDiscount = (A + B) - discountMoney;
        System.out.println("priceWithDiscount: " + priceWithDiscount);

        priceWithDiscount = (A + B) * (100 - discount) / 100;
        System.out.println("Цена товаров со скидкой: " + priceWithDiscount + " Евро");


        // Задача 3

     /*
     Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю.
     Вычислите среднюю температуру за неделю и выведете ее на печать.
     */
        int t1 = 8;
        int t2 = 5;
        int t3 = 5;
        int t4 = 5;
        int t5 = 5;
        int t6 = 5;
        int t7 = 5;

        double averageTemp = ((double) t1 + t2 + t3 + t4 + t5 + t6 + t7) / 7;

        System.out.println("averageTemp: " + averageTemp);


        // Задача 4
        // x % 5 -> ()

        //Деление на 2

        int num1 = 5;
        int remainder2 = num1 % 2;

        System.out.println("Остаток от деления " + num1 + " на 2: " + remainder2);

        // Деление на 3

        int num2 = 8;
        int remainder3 = num2 % 3;

        System.out.println("Остаток от деления " + num2 + " на 3: " + remainder3);

        // Задача 5

        int x = 3;

        x += x++;

        System.out.println(+x);
        x++; // x = x + 1; Инкремент


    }
}
