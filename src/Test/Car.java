package Test;

public class Car {
    // Создайте класс для описание автомобиля у которого
    //должны быть следующие характеристики:
    //1) производитель
    //2) модель
    //3) цвет
    //
    //Автомобиль должен уметь "заводить двигатель", "сигналить" и "выключать двигатель"
    //(напечатайте соответствующее сообщение как реакцию на действие)
    //
    //Причем Сигнал должен издавать звук который вы ему передадите

    private String manufacturer;
    private String model;
    private String color;
    private boolean engineStarted;

    public Car(String toyota, String camry, String blue) {

    }

    public void Car(String manufacturer, String model, String color) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
    }

    public void startEngine() {
        if (!engineStarted) {
            System.out.println("Двигатель запущен.");
            engineStarted = true;
        } else {
            System.out.println("Двигатель уже запущен.");
        }
    }

    public void signal(String sound) {
        System.out.println(engineStarted ? "БИП-БИП! " + sound : "Сначала нужно запустить двигатель.");
    }

    public void stopEngine() {
        if (engineStarted) {
            System.out.println("Двигатель выключен.");
            engineStarted = false;
        } else {
            System.out.println("Двигатель уже выключен.");
        }
    }

}



