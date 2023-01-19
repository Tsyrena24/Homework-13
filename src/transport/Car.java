package transport;

import java.security.Key;
import java.time.LocalDate;
import java.util.Objects;

public class Car extends Transport{

    public static class Key {
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

        @Override
        public String toString() {
            return (isRemoteStartEngine()? "удаленный запуск двигателя":"без удаленного запуск двигателя") + ", "+
             (isKeylessAccess()? "безключевой доступ ":"безключевой запуск отсутствует");
        }
    }

    private double engineVolume;
    private String gear;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean winterTypes;
    private Key key;

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String gear, String bodyType, String registrationNumber, int numberOfSeats, boolean winterTypes, Key key, int maxMovementSpeed) {
        super(brand, model, year, country, color, maxMovementSpeed);

        setEngineVolume(engineVolume);

        setColor(color);

        setGear(gear);

        if (bodyType != null && !bodyType.isEmpty() && !bodyType.isBlank()) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = "Седан";
        }

        setRegistrationNumber(registrationNumber);

        if (numberOfSeats < 2 || numberOfSeats > 9) {
            numberOfSeats = 5;
            throw new IndexOutOfBoundsException("Количество мест должно быть от 2 до 9, включая водителя");
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        this.winterTypes = winterTypes;
        setKey(key);
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

    public final String getGear() {
        return gear;
    }

    public void setGear (String gear) {
        if (gear != null && !gear.isEmpty()) {
            this.gear = gear;
        } else {
            this.gear = "A";
        }

    }

    public final String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public final void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && !registrationNumber.isEmpty()) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "x000xx000";
        }
    }

    public final int getNumberOfSeats() {
        return numberOfSeats;
    }

    public final boolean isWinterTypes() {
        return winterTypes;
    }

    public void setWinterTypes(boolean winterTypes) {
        this.winterTypes = winterTypes;
    }
    public final Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;
    }

    public void changeTypes(int month) {
        if (winterTypes == false) {
            if (month == 1 || month == 2 || month == 3 || month == 11 || month == 12) {
                this.winterTypes = !this.winterTypes;
                System.out.println("Время менять шины на зимние!");
                winterTypes = true;
            } else {
                System.out.println("Пока можно не менять летние шины");
            }
        } else if (month == 4 || month == 5 || month == 6 || month == 7 || month == 8 || month == 9 || month == 10) {
            this.winterTypes = !this.winterTypes;
            System.out.println("Время менять шины на летние!");
            winterTypes = false;
        } else {
            System.out.println("Пока можно не менять зимние шины");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && numberOfSeats == car.numberOfSeats && winterTypes == car.winterTypes && Objects.equals(gear, car.gear) && Objects.equals(bodyType, car.bodyType) && Objects.equals(registrationNumber, car.registrationNumber) && Objects.equals(key, car.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), engineVolume, gear, bodyType, registrationNumber, numberOfSeats, winterTypes, key);
    }

    @Override
    public String toString() {
        return super.toString() + engineVolume + " л, цвет кузова - " + ", коробка передач - " + gear + ", тип кузова -  " + bodyType + ", региcтрационный номер - " + registrationNumber +
                ", кол-во сидений - " + numberOfSeats + ", резина - " + (winterTypes? "зимняя" : "летняя") + ", " + key + ", макс. скорость - ";
    }
}

