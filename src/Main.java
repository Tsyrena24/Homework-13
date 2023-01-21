//import transport.Bus;
import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import transport.*;

public class Main {
//    private static void printInfo(Transport<?> transport) {
//        System.out.println("водитель "+transport.getDriver().getFullName()+" управляет автомобилем "+transport.getBrand()+transport.getModel()+" и будет участвовать в заезде");
//    }

    public static void main(String[] args) {

        Car ford = new Car("Ford", "12", 4.6, BodyType.BODY_TYPE_SEDAN);
        Car bmbZ5 = new Car("BMB", "Z5", 5.2, BodyType.BODY_TYPE_CROSSOVER);
        Car ladaXXX = new Car("Lada", "XXX", 4.1, BodyType.BODY_TYPE_STATION_WAGON);
        System.out.println(ford);
        System.out.println(bmbZ5);
        System.out.println(ladaXXX);
        System.out.println();
        ford.pitStop();
        bmbZ5.startMoving();
        ladaXXX.finishMoving();

        System.out.println("-------------------------------------------------------------");

        Trucks gaz = new Trucks("Gaz", "AAA", 1.4, LoadCapacity.LOAD_CAPACITY_N1);
        Trucks yyy = new Trucks("YYY", "T6", 3.5, LoadCapacity.LOAD_CAPACITY_N2);
        System.out.println(gaz);
        System.out.println(yyy);
        gaz.printType();
        yyy.printType();
        System.out.println();
        gaz.pitStop();
        yyy.startMoving();
        yyy.finishMoving();

        System.out.println("------------------------------------------------------------");

        Bus paz = new Bus("PAZ", "school", 3.2, SeatsCapacity.SEATS_CAPACITY_MEDIUM);
        Bus bus = new Bus("Bus", "XL", 3.6, SeatsCapacity.SEATS_CAPACITY_EXTREMELY_LARGE);
        System.out.println(paz);
        System.out.println(bus);
        paz.printType();
        bus.printType();
        System.out.println();
        paz.pitStop();
        paz.startMoving();
        paz.finishMoving();

        System.out.println("-----------------------------------------");

        DriverB alexey = new DriverB("Алексей", true, 10, "");
        DriverC michael = new DriverC("Михаил", true, 15, "f");
        DriverD alex = new DriverD("Александр", true, 7, "d");
        System.out.println(alexey);
//        alexey.drive(ladaXXX);
//        alexey.startMoving();
        System.out.println(michael);
//        michael.drive(yyy);
//        michael.refuel();
        System.out.println(alex);
//        alex.drive(paz);
//        alex.stay();
//        System.out.println();


//            DriverD driverD = new DriverD("Driver cat.C №" + i, true, 5 + i);
//            Bus bus = new Bus("Bus brand №" + i, " model №" + i, 4.7, driverD);
//
//            DriverC driverC = new DriverC("Driver cat.D №" + i, true, 5 + i);
//            Trucks truck = new Trucks("Truck brand №" + i, " model №" + i, 4.7, driverC);

//            printInfo(car);
//            printInfo(bus);
//            printInfo(truck);



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
