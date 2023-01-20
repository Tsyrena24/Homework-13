package Driver;

import transport.Bus;

public class DriverD <T extends Bus> extends Driver {
    public DriverD(String fullName, boolean driverLicense, int experienceYear) {
        super(fullName, driverLicense, experienceYear);
    }
    public void drive(T bus) {
        System.out.println("Водитель: " + getFullName() + " ведет автомобиль: " + bus.getBrand() + " " +
                bus.getModel() + " и примет участие в гонке");
    }
    @Override
    public void startMoving() {
        System.out.println("Водитель категории D " + getFullName() + " начал движение");
    }

    @Override
    public void stay() {
        System.out.println("Водитель категории D " + getFullName() + " закончил движение");

    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории D " + getFullName() + " зарлавляет автомобиль");

    }
}