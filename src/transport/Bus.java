package transport;

import java.util.Objects;

public class Bus extends Transport{

    private final int capacityOfPassengers;
    private final boolean cargoDepartment;
    private final int doorsOfPassengers;

    public Bus(String brand, String model, int year, String country, String color, int maxMovementSpeed, int capacityOfPassengers, boolean cargoDepartment, int doorsOfPassengers) {
        super(brand, model, year, country, color, maxMovementSpeed);

        if (capacityOfPassengers <= 0) {
            this.capacityOfPassengers = 40;
        } else {
            this.capacityOfPassengers = capacityOfPassengers;
        }

        this.cargoDepartment = cargoDepartment;

        if (doorsOfPassengers < 1 || doorsOfPassengers > 2) {
            this.doorsOfPassengers = 2;
        } else this.doorsOfPassengers = doorsOfPassengers;

    }

    public int getCapacityOfPassengers() {
        return capacityOfPassengers;
    }

    public boolean isCargoDepartment() {
        return cargoDepartment;
    }

    public int getDoorsOfPassengers() {
        return doorsOfPassengers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return capacityOfPassengers == bus.capacityOfPassengers && cargoDepartment == bus.cargoDepartment && doorsOfPassengers == bus.doorsOfPassengers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capacityOfPassengers, cargoDepartment, doorsOfPassengers);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", количество пассажирских мест - " + capacityOfPassengers +
                ", наличие багажного отсека - " + (cargoDepartment? "имеется": "нет в наличии") +
                ", количество дверей - " + doorsOfPassengers;
    }
}

