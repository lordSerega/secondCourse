package ru.skypro.lesson2;

public abstract class ElectricTransport extends Transport{

    public ElectricTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void service() {
        super.service();
        checkEngine();
    }

}
