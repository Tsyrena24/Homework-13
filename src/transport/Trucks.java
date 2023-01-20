package transport;

import Driver.DriverC;

import java.util.Objects;

public class Trucks extends Transport <DriverC>{
    private LoadCapacity loadCapacity;

    public Trucks(String brand, String model, double engineVolume, LoadCapacity loadCapacity ) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Недостаточно данных о грузовике");
        } else {

            String loadCapacityLowerLimit = loadCapacity.getLoadCapacityLowerLimit() == null ? "" : " от " +
                    loadCapacity.getLoadCapacityLowerLimit() + " тонн";
            String loadCapacityUpperLimit = loadCapacity.getLoadCapacityUpperLimit() == null ? "" : " до " +
                    loadCapacity.getLoadCapacityUpperLimit() + " тонн";
            System.out.println("Грузоподемность грузовика " + getBrand() + " " + getModel() + ": " + loadCapacityLowerLimit + loadCapacityUpperLimit);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void startMoving() {
        System.out.println("Марка грузовика - " + getBrand() + " " + getModel());
        System.out.println("Завожу ключ зажигания");
        System.out.println("Нажимаю на газ");
        System.out.println("Еду");
    }


    @Override
    public void finishMoving() {
        System.out.println("Марка грузовика - " +getBrand() + " " + getModel());
        System.out.println("Нажимаю на тормоз");
        System.out.println("Останавливаюсь");
        System.out.println("Выключаю ключ зажигания");
    }

    @Override
    public void pitStop() {
        System.out.println("Питстоп для грузовика " + getBrand() + " " + getModel());
    }

    @Override
    public void bestLapTime() {
        int minTime = 20;
        int maxTime = 65;
        int maxLap = (int) (minTime + (maxTime - minTime) * Math.random());
        System.out.println("Лучшее время круга для грузовика: " + getBrand() + " " + getModel() + " за " + maxLap + " минут");

    }

    @Override
    public void maxSpeedParticipant() {
        int minTime = 60;
        int maxTime = 160;
        int maxSpeed = (int) (minTime + (maxTime - minTime) * Math.random());
        System.out.println("Максимальная скорость для грузовика: " + getBrand() + " " + getModel() + " - " + maxSpeed +" км/ч");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Trucks trucks = (Trucks) o;
        return loadCapacity == trucks.loadCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity);
    }
}
