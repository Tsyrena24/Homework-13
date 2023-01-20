package transport;

public class DriverD extends Driver {
    public DriverD(String fullName, boolean driverLicense, int experienceYear) {
        super(fullName, driverLicense, experienceYear);
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
        System.out.println("Водитель категории D " + getFullName() + " заплавляет автомобиль");

    }
}