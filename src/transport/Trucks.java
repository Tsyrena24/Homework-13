package transport;

import Driver.Driver;
import Driver.DriverC;
import Mechanic.Mechanic;

import java.util.ArrayList;
import java.util.Objects;

import Mechanic.MechanicProfessionalSkills;

public class Trucks extends Transport <DriverC>{
    private LoadCapacity loadCapacity;

    public Trucks(String brand, String model, double engineVolume, LoadCapacity loadCapacity, DriverC <Trucks> driver) {
        super(brand, model, engineVolume, driver);
        this.loadCapacity = loadCapacity;
    }

    public Trucks(String brand, String model, double engineVolume,  LoadCapacity loadCapacity, DriverC<Trucks> driver, ArrayList<Driver> drivers,
                  int numberOfMechanics, ArrayList<Mechanic> mechanics) {

        super(brand, model, engineVolume, driver, drivers, numberOfMechanics, mechanics);
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
    public void passDiagnostics() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " прошел диагностику успешно");
    }

    @Override
    public void getInformationTransportMechanicDriver() {
        if (mechanics != null && drivers != null && !mechanics.isEmpty() && !drivers.isEmpty()) {
            for (Mechanic mechanic : mechanics) {
                if (mechanic.getProfessionalSkills() == MechanicProfessionalSkills.MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_BUS||
                        mechanic.getProfessionalSkills() == MechanicProfessionalSkills.MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_ALL_TRANSPORT
                                && mechanics.size() < 3) {
                    System.out.println("У грузовика " + getBrand() + " " + getModel() + ", обслуживает механик " + mechanic.getFullName() + ".");
                }
            }
            for (Driver driver : drivers) {
                if (Objects.equals(getDriver().getFullName(), driver.getFullName())) {
                    System.out.println("У грузовика " + getBrand() + " " + getModel() + ", водитель " + driver.getFullName() + ".");
                }
            }
        } else if (mechanics == null && (drivers != null || !drivers.isEmpty())) {
            for (Driver driver : drivers) {
                if (Objects.equals(getDriver().getFullName(), getDriver().getFullName())) {
                    System.out.println("У грузовика " + getBrand() + " " + getModel() + ", нет механика, водитель " + driver.getFullName() + ".");
                }
            }
        } else if ((mechanics != null || !mechanics.isEmpty()) && drivers == null) {
            for (Mechanic mechanic : mechanics) {
                if (mechanic.getProfessionalSkills() == MechanicProfessionalSkills.MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_CARS ||
                        mechanic.getProfessionalSkills() == MechanicProfessionalSkills.MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_ALL_TRANSPORT
                                && mechanics.size() < 3) {
                    System.out.println("У грузовика " + getBrand() + " " + getModel() + ", нет водителя, обслуживает механик " + mechanic.getFullName() + ".");
                }
            }

        } else
            System.out.println("У автомобиля " + getBrand() + " " + getModel() + ", нет механика и водителя.");

    }


    @Override
    public void addMechanicInList(Mechanic mechanic) {

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
