public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3, "черный", 2020, "Германия");
        Car car3 = new Car("BMW", "Z8", 3, "черный", 2021, "Германия");
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Car car5 = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        Car car6 = new Car("", null, 0,null,0,null);

        System.out.println(car1.brand);
        System.out.println(car2.brand);
        System.out.println(car3.engineVolume);
        System.out.println(car4.color);
        System.out.println(car5.year);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        System.out.println(car6);

    }
}