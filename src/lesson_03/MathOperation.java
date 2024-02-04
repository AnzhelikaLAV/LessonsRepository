package lesson_03;

public class MathOperation {
    public static void main(String[] args) {

        int var1 = 20;
        int var2 = 7;

        int result;

        // сложение
        result = var1 + var2;
        //Результат вычислений выражения в правой части присваивается в переменную в левой части присвоения
        System.out.println("result " + result);
        result = 15 + 6;
        System.out.println("result " + result);
        int result2 = var1 + var2; //обьявление и инициализация результатом вычисления

        // вычитание
        result = var1 - var2;
        System.out.println("result -: " + result);

        // * умножение
        result = var1 * var2;
        System.out.println("multResult: " + result);

        //  / - целочисленное деление
        // 20 / 7 -> 2 целые и в остатке 6;
        result = var1 / var2;
        System.out.println("devResult: " + result);

        // % и остаток от деления
        result = var1 % var2;
        System.out.println("restResult: " + result);

        System.out.println("целочисленное деление 4 / 2 = " + (4 / 2)); // 2
        System.out.println("Остаток отделения 4 % 2 = " + (4 % 2)); // 0

        System.out.println((5 / 10)); // 0
        System.out.println((5 % 10)); // 5

        // 28 / 10 -> 2 целая и 8 в остатке -> 2 * 10 + 8

        System.out.println("=============================\n");

        // / операция деление

        double doubleVar = 20.0d; // явно указано, что число записано в формате double
        double doubleSeven = 7.0; // все числа, записанные в нашем коде c "."считаются числами в формате double

        double doubleResult = doubleVar / doubleSeven;
        System.out.println("doubleResult dev = " + doubleResult);

        //Форматированный вывод
        int a = 20;
        int b = 7;
        int intResult = a / b;

        /*в терминале выведет одинаково(либо первый неудобный вариант/
        либо второй-попроще):Результат деления 20 на 7 равен = 2    */
        System.out.println("Результат деления " + a + " на " + b + " равен = " + intResult);
        System.out.printf("Результат деления %d на %d равен = %d\n", a, b, intResult); // d-digit-число
                        /*
         Форматированный вывод. Мы используем шаблон вывода и список значений,
         которые будут поставлены в этот шаблон */

        /* printLine - ln
           printformat - f
         чтобы перенести на новую строку в терминале в System.out.printF
         либо ставим: \n ->  перевода каретки (курсора) на новую строку
         либо   System.out.println(); с пустым значением, тогда 2 строки не склеятся
         напр: Результат деления 20 на 7 равен = 2Что-нибудь!
                                                здесь
         \n можно поставить в любом месте ("Результат деления %d на %d \nравен = %d\n", a, b, intResult);
                                                                       здесь
           Результат деления 20 на 7 (перенес строку)
           равен = 2

           В printf мы пишем в одних фигурных скобках шаблон("в шаблоне указ-ем места, на к-рых мы хотим поставить
           числа, числа с плавающей точкой, текст" после кавычек ставим через запятые  нужные значения)
           */

        System.out.println("Что-нибудь!");


        System.out.printf("Округленный вывод результата деления %.2f\n", doubleResult);
        // %d - шаблон для цифры (целочисленное)
        // %f шаблон для числа с плавающей точкой
        // %.2f вывести число с плавающей точкой. Отобразить ровно 2 знака после запятой
        // Результат в терминале: Округленный вывод результата деления 2,86

        //IEEE 754 стандарт

        //Проблемы с  double
        double x = 0.1;
        double y = 0.2;
        double z = x + y; // должно быть 0.3
        System.out.println("z = " + z); // z = 0.3000000000000004

        // 100.50 euro BigDecimal формат с деньгами позже будем учить

        x = 1.0;
        y = 4.0;
        z = x / y; // 0.333333333333333
        System.out.println(z);
    }
}
