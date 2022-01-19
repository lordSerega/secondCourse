package ru.skypro.lesson2;

public class Truck extends ElectricTransport{


    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

        public void checkTrailer() {
            System.out.println("Проверяем прицеп");
        }

        public void service() {
            super.service();
         checkTrailer();
        }

}
