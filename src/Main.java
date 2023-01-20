//import transport.Bus;
import transport.*;

public class Main {
    private static void printInfo(Transport<?> transport) {
        System.out.println("водитель "+transport.getDriver().getFullName()+" управляет автомобилем "+transport.getBrand()+transport.getModel()+" и будет участвовать в заезде");
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB("Driver cat.B №" + i, true, 5 + i);
            Car car = new Car("Car brand №" + i, " model №" + i, 3.5, driverB);

            DriverD driverD = new DriverD("Driver cat.C №" + i, true, 5 + i);
            Bus bus = new Bus("Bus brand №" + i, " model №" + i, 4.7, driverD);

            DriverC driverC = new DriverC("Driver cat.D №" + i, true, 5 + i);
            Trucks truck = new Trucks("Truck brand №" + i, " model №" + i, 4.7, driverC);

            printInfo(car);
            printInfo(bus);
            printInfo(truck);
        }


//        Car sportCar = new Car("Car", "200", 1.4, 2010, "желтый", "auto", true, 250);
//        Car lada = new Car("Lada", "2012", 1.5, 2000, "зеленый", "m", true,260);
//        System.out.println(lada);
//        System.out.println(sportCar);
//        sportCar.startMoving();
//        sportCar.finishMoving();
//        sportCar.pitStop(10);
//        lada.bestLapTime(13.6);
//        lada.maxSpeedParticipant();
//        System.out.println();
//
//        Bus school = new Bus("Gaz", "2020", 1.6, "school", 40, false, 2, 180);
//        Bus gaz = new Bus("Газ", "230", 2.4, "городской", 40, false, 2, 160);
//        System.out.println(school);
//        gaz.startMoving();
//        gaz.finishMoving();
//        school.pitStop(15.50);
//        gaz.bestLapTime(10);
//        school.maxSpeedParticipant();
//        System.out.println();
//
//        Trucks utd = new Trucks("UTD", "10-3", 2.6, "зерновой", 10, true, 160);
//        System.out.println(utd);
//        utd.startMoving();
//        utd.finishMoving();
//        utd.pitStop(13.21);
//        utd.bestLapTime(9.3);
//        utd.maxSpeedParticipant();


//
//        System.out.println(sportCar);;
//        System.out.println(gaz);
//        System.out.println();
//
//
//        System.out.println();
//
//        gaz.startMoving();


    }
}