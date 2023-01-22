import Driver.Driver;
import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import Mechanic.Mechanic;
import transport.*;
import java.util.ArrayList;

import static Mechanic.MechanicProfessionalSkills.*;

public class Main {
    public static void divideToPrint() {
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Mechanic> mechanics = new ArrayList<Mechanic>();
        Mechanic ivan = new Mechanic("Иван Иванович", "ИП Багажник", MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_BUS);
        Mechanic alexey = new Mechanic("Алексей Иванович", "ИП Шина", MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_BUS);
        Mechanic zoi = new Mechanic("Зоя Ивановна", "ИП Капот", MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_TRUCKS);
        Mechanic katya = new Mechanic("Екатерина Ивановна", "ИП Резина", MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_TRUCKS);
        Mechanic sergei = new Mechanic("Сергей Иванович", "ИП Колесо", MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_CARS);
        Mechanic zhenya = new Mechanic("Евгений Иванович", "ИП 360", MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_CARS);
        Mechanic anna = new Mechanic("Анна Иванова", "ИП Руль", MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_ALL_TRANSPORT);
        Mechanic sofiya = new Mechanic("София Иванова", "ИП Финиш", MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_ALL_TRANSPORT);
        mechanics.add(alexey);
        mechanics.add(ivan);
        mechanics.add(zoi);
        mechanics.add(katya);
        mechanics.add(sergei);
        mechanics.add(zhenya);
        mechanics.add(anna);
        mechanics.add(sofiya);
//        System.out.println(mechanics);
        mechanics.forEach(System.out::println);


        divideToPrint();
        ArrayList<Driver> drivers = new ArrayList<Driver>();
        DriverB<Car> michael = new DriverB<>("Михаил Иванович", true, 10, "B");
        DriverB<Car> max = new DriverB<>("Максим Иванович", true, 10, "B");
        DriverC<Trucks> alex = new DriverC<>("Александр Иванович", true, 15, "C");
        DriverC<Trucks> viktor = new DriverC<>("Виктор Иванович", true, 15, "C");
        DriverD<Bus> svetlana = new DriverD<>("Светлана Иванова", true, 7, "D");
        DriverD<Bus> olya = new DriverD<>("Ольга Иванова", true, 7, "D");
        drivers.add(michael);
        drivers.add(max);
        drivers.add(alex);
        drivers.add(viktor);
        drivers.add(svetlana);
        drivers.add(olya);
//        System.out.println(drivers);
        drivers.forEach(System.out::println);


        divideToPrint();
        ArrayList<Transport> transports = new ArrayList<Transport>();
        Car lada = new Car("Lada", "CCC", 12.4, BodyType.BODY_TYPE_STATION_WAGON, max, drivers, 2, mechanics);
        Car fordZ34 = new Car("Ford", "Z34", 4.6, BodyType.BODY_TYPE_STATION_WAGON, michael, drivers, 2, mechanics);

        Bus aaaBus = new Bus("AAA", "111", 10, SeatsCapacity.SEATS_CAPACITY_MEDIUM, svetlana, drivers, 2, mechanics);
        Bus bbbBus = new Bus("bbb", "222", 12.3, SeatsCapacity.SEATS_CAPACITY_LARGE, olya, drivers, 2, mechanics);

        Trucks kamaz = new Trucks("Kamaz", "XXX", 15.7, LoadCapacity.LOAD_CAPACITY_N1, alex, drivers, 2, mechanics);
        Trucks gaz = new Trucks("Gazel", "YYY", 16, LoadCapacity.LOAD_CAPACITY_N2, viktor, drivers, 2, mechanics);
        transports.add(lada);
        transports.add(fordZ34);
        transports.add(aaaBus);
        transports.add(bbbBus);
        transports.add(kamaz);
        transports.add(gaz);
        transports.forEach(System.out::println);

        lada.pitStop();
        fordZ34.startMoving();
        kamaz.finishMoving();

        divideToPrint();
        ArrayList<Transport> listOfCars = new ArrayList<>();
        ServiceStation serviceQueue = new ServiceStation(listOfCars);
        serviceQueue.addCarToQueue(lada);
        serviceQueue.addCarToQueue(fordZ34);
        serviceQueue.addCarToQueue(kamaz);
        serviceQueue.addCarToQueue(gaz);
        System.out.println("Порядок очереди авто со всеми характеристиками: " + serviceQueue.getTransportDeque());
        serviceQueue.passTheVehicleCheckTransport();
        System.out.println("Порядок очереди авто со всеми характеристиками: " + serviceQueue.getTransportDeque());
        serviceQueue.passTheVehicleCheckTransport();
        System.out.println("Порядок очереди авто со всеми характеристиками: " + serviceQueue.getTransportDeque());

        serviceQueue.addCarToQueue(lada);
        System.out.println("Порядок очереди авто со всеми характеристиками: " + serviceQueue.getTransportDeque());

        divideToPrint();
        lada.getInformationTransportMechanicDriver();
        fordZ34.getInformationTransportMechanicDriver();
        aaaBus.getInformationTransportMechanicDriver();
        bbbBus.getInformationTransportMechanicDriver();
        kamaz.getInformationTransportMechanicDriver();
        gaz.getInformationTransportMechanicDriver();


    }
}