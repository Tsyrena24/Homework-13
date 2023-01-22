package Driver;

import Driver.Driver;
import transport.Trucks;

public class DriverC <T extends Trucks> extends Driver {

    public DriverC(String fullName, boolean driverLicense, int experienceYear, String category) {
        super(fullName, driverLicense, experienceYear, category);
    }
    public void drive(T trucks) {
        System.out.println("Водитель: " + getFullName() + " с водительскими правами категории С, ведет автомобиль: " + trucks.getBrand() + " " +
                trucks.getModel() + " и примет участие в гонке");
    }
    @Override
    public void startMoving() {
        System.out.println("Водитель категории C " + getFullName() + " начал движение");
    }

    @Override
    public void stay() {
        System.out.println("Водитель категории C " + getFullName() + " закончил движение");

    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории C " + getFullName() + " заправляет автомобиль");

    }
}
