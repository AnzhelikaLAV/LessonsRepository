package homework_07;

import java.util.Random;

public class Task2 {
    // Реализовать с использованием switch
    // Ваш ребенок принес оценку за контрольную работу по математике.
    // В школе 12 бальная система. Запишите в переменную случайное число от 0 до 12.
    // Вы разрешаете ребенку смотреть телевизор не более 60 минут в день.
    // (Оставшееся время не может быть больше 1 часа)
    // На сегодня у него осталось 45 минут. (записать в переменную)
    //
    //Если оценка от 10 до 12 баллов -> Скажите ему, как вы рады и добавьте
    // к оставшемуся на сегодня времени 1 час от 7 до 9
    // -> Слова похвалы на экран + ко времени 45 минут от 4 до 6 ->
    // Нейтральные слова + ко времени 15 минут 3 -> Огорчитесь.
    // Минус 30 минут ко времени оценка меньше -> Трагедия. Сегодня ТВ смотреть запрещено
    //
    //Выведите на экран оставшееся на сегодня время для просмотра ТВ
    //
    //P.S. Реализовать с использованием switch

    public static void main(String[] args) {

        Random random = new Random();
        int grade = random.nextInt(13);


        int leftTime = 45;
        int count = 0;


        System.out.println("Оценка: " + grade);
        System.out.println("Осталось времени для просмотра ТВ: " + leftTime + " минут");


        switch (grade) {
            case 12:
            case 11:
            case 10:
                System.out.println("Отлично! Молодец!");
                leftTime += 60;
                break;
            case 9:
            case 8:
            case 7:
                System.out.println("Умница");
                leftTime += 45;
                break;
            case 6:
            case 5:
            case 4:
                System.out.println("Неплохо. Не останавливайся!");
                leftTime += 15;
                break;
            case 3:
                System.out.println("Постарайся! Ты можешь лучше");
                leftTime -= 30;
                break;
            case 2:
            case 1:
            case 0:
                System.out.println("Упс. Сегодня без ТВ.");
                leftTime = 0;
            default:
                System.out.println("Ребенок, ты волшебник. Таких оценок не бывает");
        }

        if (leftTime > 60) {
            leftTime = 60;
        } else if (leftTime < 0) {
            leftTime = 0;
        }

        System.out.println("Осталось времени для просмотра ТВ:  " + leftTime + " минут");
        count++;
       }
    }

