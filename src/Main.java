import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия", "М", "Седан", "К432АМ000",5, true, null, 200);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3, "черный", 2020, "Германия", "А", "Седан", "а888аа989", 4, false, new Car.Key(true, true), -100);
        Car car3 = new Car("BMW", "Z8", 3, "черный", 2021, "Германия", "М","Пикап", "в675вв765", 5, true, new Car.Key(true, false), 210);
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", "А", "Кроссовер", "н765нн000", 7, false, new Car.Key(false, true),190);
        Car car5 = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "А", "Пикап", "о123оо009", 9, true, new Car.Key(false, false), 260);
//        Car car6 = new Car("", null, 0,null,0,null);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

        car2.changeTypes(1);
        System.out.println(car2.isWinterTypes());

        Bus schoolBus = new Bus("ГАЗель", "ГАЗ-3302", 2001, "Россия", "желтый", 120, 40, false, 2);
        System.out.println(schoolBus);
    }
}