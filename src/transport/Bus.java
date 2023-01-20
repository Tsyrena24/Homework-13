package transport;

import Driver.DriverD;

import java.util.Objects;

public class Bus extends Transport <DriverD> {
    private SeatsCapacity seatsCapacity;

    public Bus(String brand, String model, double engineVolume,  SeatsCapacity seatsCapacity) {
        super(brand, model, engineVolume);
        this.seatsCapacity = seatsCapacity;
    }

    public SeatsCapacity getSeatsCapacity() {
        return seatsCapacity;
    }

    public void setSeatsCapacity(SeatsCapacity seatsCapacity) {
        this.seatsCapacity = seatsCapacity;
    }
    public void printType() {
        if (seatsCapacity == null) {
            System.out.println("Недостаточно информации");
        } else {
            System.out.println("Вместимость автобуса " + getBrand() + " " + getModel() + ": от " + seatsCapacity.getSeatsCapacityLowerLimit()
                    + " до " + seatsCapacity.getSeatsCapacityUpperLimit() + " пассажирских мест");
        }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return seatsCapacity == bus.seatsCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), seatsCapacity);
    }
}

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

//
//
//    @Override
//    public String toString() {
//        return super.toString() +
//                ", количество пассажирских мест - " + capacityOfPassengers +
//                ", наличие багажного отсека - " + (cargoDepartment? "имеется": "нет в наличии") +
//                ", количество дверей - " + doorsOfPassengers;
//    }
//}

