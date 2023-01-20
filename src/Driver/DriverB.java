package Driver;

import Driver.Driver;
import transport.Car;
import transport.Competing;
import transport.Transport;

public class DriverB <T extends Car> extends Driver {

    public DriverB(String fullName, boolean driverLicense, int experienceYear) {
        super(fullName, driverLicense, experienceYear);
    }

    public void drive(T car) {
        System.out.println("Водитель: " + getFullName() + " ведет автомобиль: " + car.getBrand() + " " +
                car.getModel() + " и примет участие в гонке");
    }
    @Override
    public void startMoving() {
        System.out.println("Водитель категории В " + getFullName() + " начал движение");
    }

    @Override
    public void stay() {
        System.out.println("Водитель категории В " + getFullName() + " закончил движение");

    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории В " + getFullName() + " заправляет автомобиль");

    }

}
