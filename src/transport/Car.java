package transport;
import Driver.Driver;
import Driver.DriverB;
import Mechanic.Mechanic;
import java.util.ArrayList;
import java.util.Objects;

import Mechanic.MechanicProfessionalSkills;
public class Car extends Transport <DriverB>  {
    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, BodyType bodyType, DriverB <Car> driver) {
        super(brand, model, engineVolume, driver);
        this.bodyType = bodyType;
    }

    public Car(String brand, String model, double engineVolume,  BodyType bodyType, DriverB <Car> driver, ArrayList<Driver> drivers,
               int numberOfMechanics, ArrayList<Mechanic> mechanics) {
        super(brand, model, engineVolume, driver, drivers, numberOfMechanics, mechanics);
        this.bodyType = bodyType;
    }


    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
    public void printType() {
        if (bodyType == null) {
            System.out.println("There is not enough data on car");
        } else {
            System.out.println(bodyType);
        }
    }

    @Override
    public void addMechanicInList(Mechanic mechanic) {

    }
    @Override
    public void getInformationTransportMechanicDriver() {
        if (mechanics != null && drivers != null && !mechanics.isEmpty() && !drivers.isEmpty()) {
            for (Mechanic mechanic : mechanics) {
                if (mechanic.getProfessionalSkills() == MechanicProfessionalSkills.MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_CARS ||
                        mechanic.getProfessionalSkills() == MechanicProfessionalSkills.MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_ALL_TRANSPORT
                                && mechanics.size() < 3) {
                    System.out.println("У автомобиля " + getBrand() + " " + getModel() + ", обслуживает механик " + mechanic.getFullName() + ".");
                }
            }
            for (Driver driver : drivers) {
                if (Objects.equals(getDriver().getFullName(), driver.getFullName())) {
                    System.out.println("У автомобиля " + getBrand() + " " + getModel() + ", водитель " + driver.getFullName() + ".");
                }
            }
        } else if (mechanics == null && (drivers != null || !drivers.isEmpty())) {
            for (Driver driver : drivers) {
                if (Objects.equals(getDriver().getFullName(), getDriver().getFullName())) {
                    System.out.println("У автомобиля " + getBrand() + " " + getModel() + ", нет механика, водитель " + driver.getFullName() + ".");
                }
            }
        } else if ((mechanics != null || !mechanics.isEmpty()) && drivers == null) {
            for (Mechanic mechanic : mechanics) {
                if (mechanic.getProfessionalSkills() == MechanicProfessionalSkills.MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_CARS ||
                        mechanic.getProfessionalSkills() == MechanicProfessionalSkills.MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_ALL_TRANSPORT
                                && mechanics.size() < 3) {
                    System.out.println("У автомобиля " + getBrand() + " " + getModel() + ", нет водителя, обслуживает механик " + mechanic.getFullName() + ".");
                }
            }

        } else
            System.out.println("У автомобиля " + getBrand() + " " + getModel() + ", нет механика и водителя.");
        }

    @Override
    public String toString() {
        return super.toString() + bodyType;
    }

    @Override
    public void startMoving() {
        System.out.println("Марка автомобиля - " + getBrand() + " " + getModel());
        System.out.println("Нажимаю на газ");
        System.out.println("Начинаю ехать");
        System.out.println("Разгоняюсь");
    }

    @Override
    public void finishMoving() {
        System.out.println("Марка автомобиля - " + getBrand() + " " + getModel());
        System.out.println("Нажимаю на тормоз");
        System.out.println("Останавливаюсь");
        System.out.println("Остановился");
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " прошел диагностику успешно");

    }
    @Override
    public void pitStop() {
        System.out.println("Питстоп для автомобиля " + getBrand() + " " + getModel());
    }

    @Override
    public void bestLapTime() {
        int minTime = 10;
        int maxTime = 30;
        int maxLap = (int) (minTime + (maxTime - minTime) * Math.random());
        System.out.println("Лучшее время круга для автомобиля: " + getBrand() + " " + getModel() + " за " + maxLap + " минут");

    }

    @Override
    public void maxSpeedParticipant() {
        int minTime = 100;
        int maxTime = 270;
        int maxSpeed = (int) (minTime + (maxTime - minTime) * Math.random());
        System.out.println("Максимальная скорость для автомобиля: " + getBrand() + " " + getModel() + " - " + maxSpeed + " км/ч");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return bodyType == car.bodyType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bodyType);
    }
}
