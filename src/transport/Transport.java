package transport;

import java.util.Objects;

public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxMovementSpeed;

    public Transport(String brand, String model, int year, String country, String color, int maxMovementSpeed) {
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

        setColor(color);
        setMaxMovementSpeed(maxMovementSpeed);
    }

    public final String getBrand() {
        return brand;
    }


    public final String getModel() {
        return model;
    }


    public final int getYear() {
        return year;
    }


    public final String getCountry() {
        return country;
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

    public int getMaxMovementSpeed() {
        return maxMovementSpeed;
    }

    public void setMaxMovementSpeed(int maxMovementSpeed) {
        if (maxMovementSpeed <= 0 || maxMovementSpeed >= 350) {
            this.maxMovementSpeed = 200;
        } else {
            this.maxMovementSpeed = maxMovementSpeed;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return year == transport.year && maxMovementSpeed == transport.maxMovementSpeed && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(country, transport.country) && Objects.equals(color, transport.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, country, color, maxMovementSpeed);
    }

    @Override
    public String toString() {
        return  getBrand() + " " + getModel() +  " л, цвет кузова - " + getColor() + ", год выпуска - " + getYear() +
                ", сборка - " + getCountry() + ", макс. скорость - "+ getMaxMovementSpeed() + " км, ";
    }

}
