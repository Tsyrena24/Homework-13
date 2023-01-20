package transport;

import Driver.Driver;

import java.util.Objects;

public abstract class Transport <T extends Driver> implements Competing{
    private final String brand;
    private final String model;
    private double engineVolume;
//    private T driver;
//    private final String country;
//    private String color;
//    private int maxMovementSpeed;


    public Transport(String brand, String model, double engineVolume) {
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
//        setDriver(driver);
//        if (year <= 0) {
//            this.year = 2000;
//        } else {
//            this.year = year;
//        }
//
//        if (country != null && !country.isEmpty() && !country.isBlank()) {
//            this.country = country;
//        } else {
//            this.country = "default";
//        }

//        setColor(color);
//        setMaxMovementSpeed(maxMovementSpeed);
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
//    public T getDriver() {
//        return driver;
//    }
//
//    public void setDriver(T driver) {
//        this.driver = driver;
//    }


    public abstract void startMoving();


    public abstract void finishMoving();

//    public void printInfo() {
//        System.out.println("Водитель " + driver.getFullName() + "управляет автомобилем " + getBrand() + " " + getModel() + " и будет участвовать в заезде");
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return
                "Марка - " + brand +
                ", модель - " + model +
                ", обьем двигателя - " + engineVolume;
    }
}




//    public final int getYear() {
//        return year;
//    }
//
//
//    public final String getCountry() {
//        return country;
//    }
//
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        if (color != null && !color.isEmpty() && !color.isBlank()) {
//            this.color = color;
//        } else {
//            this.color = "белый";
//        }
//    }
//
//    public int getMaxMovementSpeed() {
//        return maxMovementSpeed;
//    }
//
//    public void setMaxMovementSpeed(int maxMovementSpeed) {
//        if (maxMovementSpeed <= 0 || maxMovementSpeed >= 350) {
//            this.maxMovementSpeed = 200;
//        } else {
//            this.maxMovementSpeed = maxMovementSpeed;
//        }
//    }


