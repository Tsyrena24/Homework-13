package transport;

import java.util.Objects;

public class Bus extends Transport <DriverD> {

    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMoving() {
        System.out.println("Марка автобуса - " + getBrand() + " " + getModel());
        System.out.println("Включаю двигатель");
        System.out.println("Нажимаю на газ");
        System.out.println("Еду");
    }

    @Override
    public void finishMoving() {
        System.out.println("Марка автобуса - " + getBrand() + " " + getModel());
        System.out.println("Нажимаю на тормоз");
        System.out.println("Останавливаюсь");
        System.out.println("Выключаю двигатель");
    }


    @Override
    public void pitStop() {
        System.out.println("Питстоп для автобуса " + getBrand() + " " + getModel());
    }

    @Override
    public void bestLapTime() {
        int minTime = 25;
        int maxTime = 80;
        int maxLap = (int) (minTime + (maxTime - minTime) * Math.random());
        System.out.println("Лучшее время круга для автобуса: " + getBrand() + " " + getModel() + " за " + maxLap + " минут");

    }

    @Override
    public void maxSpeedParticipant() {
        int minTime = 60;
        int maxTime = 160;
        int maxSpeed = (int) (minTime + (maxTime - minTime) * Math.random());
        System.out.println("Максимальная скорость для автобуса: " + getBrand() + " " + getModel() + " - " + maxSpeed + " км/ч");
    }
}


//    public Bus(String brand, String model, int year, String country, String color, int maxMovementSpeed, int capacityOfPassengers, boolean cargoDepartment, int doorsOfPassengers) {
//        super(brand, model, year, country, color, maxMovementSpeed);


//
//        this.cargoDepartment = cargoDepartment;
//

//    }
//
//    public int getCapacityOfPassengers() {
//        return capacityOfPassengers;
//    }
//
//    public boolean isCargoDepartment() {
//        return cargoDepartment;
//    }
//
//    public int getDoorsOfPassengers() {
//        return doorsOfPassengers;
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        if (!super.equals(o)) return false;
//        Bus bus = (Bus) o;
//        return capacityOfPassengers == bus.capacityOfPassengers && cargoDepartment == bus.cargoDepartment && doorsOfPassengers == bus.doorsOfPassengers;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(super.hashCode(), capacityOfPassengers, cargoDepartment, doorsOfPassengers);
//    }
//
//    @Override
//    public String toString() {
//        return super.toString() +
//                ", количество пассажирских мест - " + capacityOfPassengers +
//                ", наличие багажного отсека - " + (cargoDepartment? "имеется": "нет в наличии") +
//                ", количество дверей - " + doorsOfPassengers;
//    }
//}

