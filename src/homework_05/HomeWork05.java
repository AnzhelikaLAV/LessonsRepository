package homework_05;

public class HomeWork05 {
    //Создайте переменную с типом String, в которой будет хранится Ваше имя.
    //Сколько букв в вашем имени? Выведите значение на экран
    //Создайте две переменные типа char. Одной присвойте первый символ имени, второй - последний символ
    //Выведите на экран десятичный код первого и последнего символа вашего     -> нужно в вывод добавить
                                                           // Десятичный код первого символа: 65
                                                           // Десятичный код последнего символа: 97

        public static void main(String[] args) {
            String name = "Anzhelika";

            int numberOfLetters = name.length();

            char firstSymbol = name.charAt(0);
            char  latestSymbol= name.charAt(name.length() - 1);

            // десятичный код первого и последнего символа
            int decimalFirstCode = (int) firstSymbol;
            int decimalLastCode  = (int) latestSymbol;

            System.out.println("Количество букв в имени: " + numberOfLetters);
            System.out.println("Первый символ: " + firstSymbol);
            System.out.println("Последний символ: " + latestSymbol);
            System.out.println("Десятичный код первого символа: " + decimalFirstCode);
            System.out.println("Десятичный код последнего символа: " + decimalLastCode);

            /*public class vp-VersionPrepoda {
        public static void main(String[] args) {
        String name = "Sergey";

        int nameLength = name.length();

        System.out.println("Букв в имени: " + nameLength);

        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length() - 1);

        System.out.println((int)firstChar); или System.out.println(1 + firstChar -1); // Десятичный код первого символа: 83
        System.out.println("Last char: " + (int) lastChar); // Десятичный код последнего символа: 121

           }
        }*/


            // 2.
            // Создайте строки:

            //"Java"
            //"is"
            //"a"
            //"powerful"
            //"language"

            //Из созданных строк склейте двумя разными способами строку: "Java is a powerful language"

            //Распечатать эту строку и ее длину

                    String str1 = "Java";
                    String str2 = "is";
                    String str3 = "a";
                    String str4 = "powerful";
                    String str5 = "language";

                    // Способ 1:
                    String result1 = String.join(" ", str1, str2, str3, str4,str5);
                    // join Соединяет строки с учетом разделителя


                    // Способ 2:
                    String result2 = str1.concat(" ")
                            .concat(str2).concat(" ")
                            .concat(str3).concat(" ")
                            .concat(str4).concat(" ")
                            .concat(str5);


                    System.out.println("Способ 1: " + result1);
                    System.out.println("Способ 2: " + result2);

                    System.out.println("Длина строки: " + result1.length());

                    // 02.2
            // Заменить в результирующей строке слово "powerful" на "super"
            // Содержит ли строка подстроку "age"?      //если содержит true, если не содержит False
                                                        //ищет не слово. а 3 буквы подряд age
            // Создайте переменную boolean типа c ответом

                    String result3 = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;

                    result3 = result3.replace("powerful", "super");
                    // replace заменяет в одной строке одну подстроку на другую

                    System.out.println("Замена: " + result3);

                    // содержит ли строка подстроку "age" ?
                    boolean сontainsAge = result1.contains("age");
                    System.out.println("Строка содержит подстроку 'age': " + сontainsAge);
                }
            }

            // vp String concatStr = String.join(" ", str, str1, str2, str3, str4);
            // join Соединяет строки с учетом разделителя
//
//        concatStr = str.concat(" ")
//                .concat(str1).concat(" ")
//                .concat(str2).concat(" ")
//                .concat(str3).concat(" ")
//                .concat(str4); // concat обьединяет строки
//
//        System.out.println(concatStr);
//        System.out.println("Длина строки: " + concatStr.length()) ;
//
//
//
//        boolean isContainAge = concatStr.contains("age");
//
//        System.out.println("isContainAge: " + isContainAge);












