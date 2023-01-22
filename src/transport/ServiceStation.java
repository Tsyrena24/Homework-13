package transport;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class ServiceStation  {
    private  ArrayList <Transport> transportList = new ArrayList<>();
    private Deque<Transport> transportDeque = new LinkedList<>();

    public ServiceStation(ArrayList<Transport> listOfCars) {
        this.transportList = listOfCars;
    }

    public void addCarToQueue(Transport transport) {
        transportDeque.add(transport);
        System.out.println(transport.getBrand() + " " + transport.getModel() + " транспортное средство добавлено в очередь");
    }

    public void passTheVehicleCheckTransport() {
        transportDeque.removeFirst();
        System.out.println("Техобслуживание успешно пройдено!");
    }


    public ArrayList<Transport> getTransportList() {
        return transportList;
    }

    public Deque<Transport> getTransportDeque() {
        return transportDeque;
    }



}
