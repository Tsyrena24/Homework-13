package transport;

import Driver.Driver;
import Driver.DriverD;
import Mechanic.Mechanic;

import java.util.ArrayList;
import java.util.Objects;

import Mechanic.MechanicProfessionalSkills;

public class Bus extends Transport <DriverD> {
    private SeatsCapacity seatsCapacity;

    public Bus(String brand, String model, double engineVolume, SeatsCapacity seatsCapacity, DriverD driver) {
        super(brand, model, engineVolume, driver);
        this.seatsCapacity = seatsCapacity;
    }

    public Bus(String brand, String model, double engineVolume, SeatsCapacity seatsCapacity, Driver driver, ArrayList<Driver> drivers, int numberOfMechanics, ArrayList<Mechanic> mechanics) {
        super(brand, model, engineVolume, driver, drivers, numberOfMechanics, mechanics);
        this.seatsCapacity = seatsCapacity;
    }

    public SeatsCapacity getSeatsCapacity() {
        return seatsCapacity;
    }

    public void setSeatsCapacity(SeatsCapacity seatsCapacity) {
        this.seatsCapacity = seatsCapacity;
    }
    public void printType() {
        if (seatsCapacity == null) {
            System.out.println("Недостаточно информации.");
        } else {
            System.out.println("Вместимость автобуса " + getBrand() + " " + getModel() + ": от " + seatsCapacity.getSeatsCapacityLowerLimit()
                    + " до " + seatsCapacity.getSeatsCapacityUpperLimit() + " пассажирских мест");
        }
    }
    @Override
    public void startMoving() {
        System.out.println("Марка автобуса - " + getBrand() + " " + getModel());
        System.out.println("Включаю двигатель");
        System.out.println("Нажимаю на газ");
        System.out.println("Еду");
    }

    @Override
    public void finishMoving() {
        System.out.println("Марка автобуса - " + getBrand() + " " + getModel());
        System.out.println("Нажимаю на тормоз");
        System.out.println("Останавливаюсь");
        System.out.println("Выключаю двигатель");
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Автобусы  диагностику проходить не могут.");
    }

    @Override
    public void addMechanicInList(Mechanic mechanic) {

    }

    @Override
    public void getInformationTransportMechanicDriver() {
        if (mechanics != null && drivers != null && !mechanics.isEmpty() && !drivers.isEmpty()) {
            for (Mechanic mechanic : mechanics) {
                if (mechanic.getProfessionalSkills() == MechanicProfessionalSkills.MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_BUS||
                        mechanic.getProfessionalSkills() == MechanicProfessionalSkills.MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_ALL_TRANSPORT
                                && mechanics.size() < 3) {
                    System.out.println("У автобуса " + getBrand() + " " + getModel() + ", обслуживает механик " + mechanic.getFullName() + ".") ;
                }
            }
            for (Driver driver : drivers) {
                if (Objects.equals(getDriver().getFullName(), driver.getFullName())) {
                    System.out.println("У автобуса " + getBrand() + " " + getModel() + ", водитель " + driver.getFullName() + ".");
                }
            }
        } else if (mechanics == null && (drivers != null || !drivers.isEmpty())) {
            for (Driver driver : drivers) {
                if (Objects.equals(getDriver().getFullName(), getDriver().getFullName())) {
                    System.out.println("У автобуса " + getBrand() + " " + getModel() + ", нет механика, водитель " + driver.getFullName() + ".");
                }
            }
        } else if ((mechanics != null || !mechanics.isEmpty()) && drivers == null) {
            for (Mechanic mechanic : mechanics) {
                if (mechanic.getProfessionalSkills() == MechanicProfessionalSkills.MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_CARS ||
                        mechanic.getProfessionalSkills() == MechanicProfessionalSkills.MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_ALL_TRANSPORT
                                && mechanics.size() < 3) {
                    System.out.println("У автобуса " + getBrand() + " " + getModel() + ", нет водителя, обслуживает механик " + mechanic.getFullName() + ".");
                }
            }

        } else
            System.out.println("У автобуса " + getBrand() + " " + getModel() + ", нет механика и водителя.");


    }




    @Override
    public void pitStop() {
        System.out.println("Питстоп для автобуса " + getBrand() + " " + getModel());
    }

    @Override
    public void bestLapTime() {
        int minTime = 25;
        int maxTime = 80;
        int maxLap = (int) (minTime + (maxTime - minTime) * Math.random());
        System.out.println("Лучшее время круга для автобуса: " + getBrand() + " " + getModel() + " за " + maxLap + " минут");

    }

    @Override
    public void maxSpeedParticipant() {
        int minTime = 60;
        int maxTime = 160;
        int maxSpeed = (int) (minTime + (maxTime - minTime) * Math.random());
        System.out.println("Максимальная скорость для автобуса: " + getBrand() + " " + getModel() + " - " + maxSpeed + " км/ч");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return seatsCapacity == bus.seatsCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), seatsCapacity);
    }
}


