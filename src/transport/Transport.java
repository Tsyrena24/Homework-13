package transport;

import Driver.Driver;
import Mechanic.Mechanic;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    protected ArrayList<Driver> drivers;
    protected ArrayList<Mechanic> mechanics;
    private int numberOfMechanics;
    private Driver driver;

    public Transport(String brand, String model, double engineVolume, Driver driver) {

        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }
        setEngineVolume(engineVolume);
        this.driver = driver;
    }

    public Transport(String brand, String model, double engineVolume, Driver driver, ArrayList <Driver> drivers,
                     int numberOfMechanics, ArrayList<Mechanic> mechanics) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }
        setEngineVolume(engineVolume);
        this.driver = driver;
        this.drivers = drivers;
        setMechanics(mechanics);
        setNumberOfMechanics(numberOfMechanics);
    }


    public final String getBrand() {
        return brand;
    }

    public final String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        if (driver != null) {
            this.driver = driver;
        }
    }

    public void setNumberOfMechanics(int numberOfMechanics) {
        if (numberOfMechanics <= 0) {
            this.numberOfMechanics = 1;
        } else if (numberOfMechanics > 3) {
            throw new IndexOutOfBoundsException("Механиков должно быть от 1 до 3 человек.");
        } else {
            this.numberOfMechanics = numberOfMechanics;
        }
    }
    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(ArrayList<Driver> drivers) {
        this.drivers = drivers;
    }

    public ArrayList<Mechanic> getMechanics() {
        return mechanics;
    }

    public void setMechanics(ArrayList<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }

    public abstract void startMoving();


    public abstract void finishMoving();

    public abstract void passDiagnostics();

    public abstract void addMechanicInList(Mechanic mechanic);

    public abstract void getInformationTransportMechanicDriver();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && numberOfMechanics == transport.numberOfMechanics && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(drivers, transport.drivers) && Objects.equals(mechanics, transport.mechanics) && Objects.equals(driver, transport.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, drivers, mechanics, numberOfMechanics, driver);
    }

    @Override
    public String toString() {
        return
                "Марка - " + brand + ", модель - " + model + ", обьем двигателя - " + engineVolume + " л.";
    }

}



