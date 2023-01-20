package transport;

public class DriverB extends Driver {

    public DriverB(String fullName, boolean driverLicense, int experienceYear) {
        super(fullName, driverLicense, experienceYear);
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
        System.out.println("Водитель категории В " + getFullName() + " заплавляет автомобиль");

    }
}
