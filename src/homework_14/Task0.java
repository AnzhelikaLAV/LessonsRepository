package homework_14;

public class Task0 {


    // Посмотрите вокруг себя. Напишите три класса, описывающие какие-то сущности вокруг Вас.
    // Не забудьте использовать абстракцию.

    // Например, опишите студента, преподавателя и, допустим, врача.
    // Вы можете выбрать свои сущности для описания.

    public static void main(String[] args) {
        Transport bmw = new Transport();
        bmw.setValues(250.5f,2500,"Blue", new byte[] {0, 0, 0});
        String res1 = bmw.getValues();
        System.out.println(res1);
        //   bmw.speed = 250.5f;
        //   bmw.weight = 2500;
        //   bmw.color = "Blue";
        //   bmw.coordinate = new byte[] {0, 0, 0};

        Transport truck = new Transport();
        truck.speed = 140.5f;
        truck.weight = 5600;
        truck.color = "Black";
        truck.coordinate = new byte[] {100, 0, 100};

        String res2 = truck.getValues();
        System.out.println(res2);

    }
}
