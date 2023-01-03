public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car (String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null || brand == " " || brand == "") {
            this.brand = "default";
        } else {
            this.brand = brand; }

        if (model == null || model == " " || model == "") {
            this.model = "default";
        } else {
            this.model = model; }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume; }

        if (color == null || color == " " || color == "") {
            this.color = "белый";
        } else {
            this.color = color; }

        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year; }

        if (country == null || country == " " || country == "") {
            this.country = "default";
        } else {
            this.country = country;
        }
    }

    @Override
    public String toString() {
        return brand + " " + model + ", объем двигателя - " + engineVolume + " л, цвет кузова - " + color + ", год выпуска - " + year + ", сборка - " + country;
    }
}
