package transport;

import java.security.Key;
import java.time.LocalDate;
import java.util.Objects;

public class Car {

    public class Key {
        private final boolean remoteStartEngine;
        private final boolean keylessAccess;

        public Key(boolean remoteStartEngine, boolean keylessAccess) {
            this.remoteStartEngine = remoteStartEngine;
            this.keylessAccess = keylessAccess;

        }

        public boolean isRemoteStartEngine() {
            return remoteStartEngine;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean winterTypes;
    private Key key;

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean winterTypes) {
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

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "белый";
        }

        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "default";
        }

        if (transmission != null && !transmission.isEmpty() && !transmission.isBlank()) {
            this.transmission = transmission;
        } else {
            this.transmission = "Auto";
        }

        if (bodyType != null && !bodyType.isEmpty() && !bodyType.isBlank()) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = "Седан";
        }

        if (registrationNumber != null && !registrationNumber.isEmpty() && !registrationNumber.isBlank()) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "x000xx000";
        }

        if (numberOfSeats < 2 || numberOfSeats > 9) {
            numberOfSeats = 5;
            throw new IndexOutOfBoundsException("Количество мест должно быть от 2 до 9, включая водителя");
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        this.winterTypes = winterTypes;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "белый";
        }
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission != null && !transmission.isEmpty()) {
            this.transmission = transmission;
        } else {
            this.transmission = "A";
        }

        if (transmission != null && !transmission.equals("A") && !transmission.equals("M")) {
            throw new IndexOutOfBoundsException("Неправильная коробка передач");
        }
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && !registrationNumber.isEmpty()) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "x000xx000";
        }
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isWinterTypes() {
        return winterTypes;
    }

    public void setWinterTypes(boolean winterTypes) {
        this.winterTypes = winterTypes;
    }


    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", объем двигателя - " + getEngineVolume() + " л, цвет кузова - " + getColor() + ", год выпуска - " + getYear() + ", сборка - " + getCountry() + ", коробка передач - " + getTransmission() + ", тип кузова -  " + getBodyType() + ", региcтрационный номер - " + getRegistrationNumber() + ", кол-во сидений - " + getNumberOfSeats() + ", резина - " + isWinterTypes();
    }

    //int month = LocalDate.getMonthValue();
    public void changeTypes(int month) {
        if (winterTypes == false) {
            if (month == 1 || month == 2 || month == 3 || month == 11 || month == 12) {
                this.winterTypes = !this.winterTypes;
                System.out.println("Время менять шины на зимние!");
            } else {
                System.out.println("Пока можно не менять летние шины");
            }
        } else if (month == 4 || month == 5 || month == 6 || month == 7 || month == 8 || month == 9 || month == 10) {
            this.winterTypes = !this.winterTypes;
            System.out.println("Время менять шины на летние!");
        } else {
            System.out.println("Пока можно не менять зимние шины");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && year == car.year && numberOfSeats == car.numberOfSeats && winterTypes == car.winterTypes && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(country, car.country) && Objects.equals(transmission, car.transmission) && Objects.equals(bodyType, car.bodyType) && Objects.equals(registrationNumber, car.registrationNumber) && Objects.equals(key, car.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, year, country, transmission, bodyType, registrationNumber, numberOfSeats, winterTypes, key);
    }
}

