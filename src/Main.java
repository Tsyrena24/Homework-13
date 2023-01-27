import Driver.Driver;
import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import Mechanic.Mechanic;
import transport.*;

import java.util.*;

import static Mechanic.MechanicProfessionalSkills.*;

public class Main {
    public static void divideToPrint() {
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Mechanic> mechanics = new ArrayList<Mechanic>();
        Mechanic sergei = new Mechanic("Сергей Иванович", "ИП Колесо", MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_CARS);
        sergei.addCarType(Car.class);
        Mechanic zhenya = new Mechanic("Евгений Иванович", "ИП 360", MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_CARS);
        zhenya.addCarType(Car.class);
        Mechanic ivan = new Mechanic("Иван Иванович", "ИП Багажник", MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_BUS);
        ivan.addCarType(Bus.class);
        Mechanic alexey = new Mechanic("Алексей Иванович", "ИП Шина", MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_BUS);
        alexey.addCarType(Bus.class);
        Mechanic zoi = new Mechanic("Зоя Ивановна", "ИП Капот", MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_TRUCKS);
        zoi.addCarType(Trucks.class);
        Mechanic katya = new Mechanic("Екатерина Ивановна", "ИП Резина", MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_TRUCKS);
        katya.addCarType(Trucks.class);
        Mechanic anna = new Mechanic("Анна Иванова", "ИП Руль", MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_ALL_TRANSPORT);
        anna.addCarType(Car.class);
        anna.addCarType(Bus.class);
        anna.addCarType(Trucks.class);
        Mechanic sofiya = new Mechanic("София Иванова", "ИП Финиш", MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_ALL_TRANSPORT);
        sofiya.addCarType(Car.class);
        sofiya.addCarType(Bus.class);
        sofiya.addCarType(Trucks.class);
        mechanics.add(alexey);
        mechanics.add(ivan);
        mechanics.add(zoi);
        mechanics.add(katya);
        mechanics.add(sergei);
        mechanics.add(zhenya);
        mechanics.add(anna);
        mechanics.add(sofiya);
//        System.out.println(mechanics);
//        mechanics.forEach(System.out::println);


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
//        drivers.forEach(System.out::println);


        divideToPrint();
        ArrayList<Transport> transports = new ArrayList<Transport>();
        Car lada = new Car("Lada", "CCC", 12.4, BodyType.BODY_TYPE_STATION_WAGON, max, drivers, 2, null);
        Car fordZ34 = new Car("Ford", "Z34", 4.6, BodyType.BODY_TYPE_STATION_WAGON, michael, drivers, 2, null);

        Bus aaaBus = new Bus("AAA", "111", 10, SeatsCapacity.SEATS_CAPACITY_MEDIUM, svetlana, drivers, 2, null);
        Bus bbbBus = new Bus("bbb", "222", 12.3, SeatsCapacity.SEATS_CAPACITY_LARGE, olya, drivers, 2, null);

        Trucks kamaz = new Trucks("Kamaz", "XXX", 15.7, LoadCapacity.LOAD_CAPACITY_N1, alex, drivers, 2, null);
        Trucks gaz = new Trucks("Gazel", "YYY", 16, LoadCapacity.LOAD_CAPACITY_N2, viktor, drivers, 2, null);
        transports.add(lada);
        transports.add(fordZ34);
        transports.add(aaaBus);
        transports.add(bbbBus);
        transports.add(kamaz);
        transports.add(gaz);
        transports.forEach(System.out::println);

        divideToPrint();
        sergei.carryOutMaintenance(lada);
        sergei.carryOutMaintenance(aaaBus);
        sergei.carryOutMaintenance(kamaz);
        System.out.println();
        ivan.carryOutMaintenance(fordZ34);
        ivan.carryOutMaintenance(bbbBus);
        ivan.carryOutMaintenance(kamaz);
        System.out.println();
        sofiya.carryOutMaintenance(lada);
        sofiya.carryOutMaintenance(bbbBus);
        sofiya.carryOutMaintenance(gaz);
        System.out.println();
        sergei.repairTheCar(lada);
        sergei.repairTheCar(aaaBus);
        alexey.repairTheCar(kamaz);
        alexey.repairTheCar(aaaBus);
        anna.repairTheCar(bbbBus);
        anna.repairTheCar(gaz);

        divideToPrint();
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


        divideToPrint();  // ручная вставка ключей
        Map<Transport, Mechanic> transportMechanicMap = new HashMap<>();
        transportMechanicMap.put(lada, sergei);
        transportMechanicMap.put(aaaBus, ivan);
        transportMechanicMap.put(kamaz, zoi);
        transportMechanicMap.put(gaz, anna);
        System.out.println(transportMechanicMap);
        printMap(transportMechanicMap);


        divideToPrint(); // можно через цикл
        Map<Transport, ArrayList<Mechanic>> transportMechanicMap1 = new HashMap<>();
        for (Transport transport : transports) {
            transportMechanicMap1.put(transport, transport.getMechanics());
        }
        for (Map.Entry<Transport, ArrayList<Mechanic>> map1 : transportMechanicMap1.entrySet()) {
            System.out.println(map1.getKey() + " " + map1.getValue());
        }

        // Set and Iterator
        divideToPrint();
        Set<Driver> driverSet = new HashSet<>();
        driverSet.add(michael);
        driverSet.add(max);
        driverSet.add(alex);
        driverSet.add(viktor);
        driverSet.add(svetlana);
        driverSet.add(olya);
        System.out.println(driverSet);

        // Выведение set через iterator
        for (Driver driver : driverSet) {
            System.out.println(driver);

        }


    }
    public static void printMap(Map <Transport, Mechanic> map) {
        for (Map.Entry<Transport, Mechanic> map1 : map.entrySet()) {
            System.out.println(map1.getKey() + " " + map1.getValue());
        }
    }

}
