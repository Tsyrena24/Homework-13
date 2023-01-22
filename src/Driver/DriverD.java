package Driver;

import transport.Bus;

public class DriverD <T extends Bus> extends Driver {
    public DriverD(String fullName, boolean driverLicense, int experienceYear, String category) {
        super(fullName, driverLicense, experienceYear, category);
    }
    public void drive(T bus) {
        System.out.println("Водитель: " + getFullName() + " с водительскими правами категории D, ведет автомобиль: " + bus.getBrand() + " " +
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