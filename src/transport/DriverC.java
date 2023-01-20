package transport;

public class DriverC extends Driver {
    public DriverC(String fullName, boolean driverLicense, int experienceYear) {
        super(fullName, driverLicense, experienceYear);
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
        System.out.println("Водитель категории C " + getFullName() + " заплавляет автомобиль");

    }
}
