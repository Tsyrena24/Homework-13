package transport;

public enum SeatsCapacity {
    SEATS_CAPACITY_EXTREMELY_SMALL(0, 10),
    SEATS_CAPACITY_SMALL(10, 25),
    SEATS_CAPACITY_MEDIUM(40, 50),
    SEATS_CAPACITY_LARGE(60, 80),
    SEATS_CAPACITY_EXTREMELY_LARGE(100, 120);

    private final Integer seatsCapacityLowerLimit;
    private final Integer seatsCapacityUpperLimit;

    SeatsCapacity(Integer seatsCapacityLowerLimit, Integer seatsCapacityUpperLimit) {
        this.seatsCapacityLowerLimit = seatsCapacityLowerLimit;
        this.seatsCapacityUpperLimit = seatsCapacityUpperLimit;
    }

    public Integer getSeatsCapacityLowerLimit() {
        return seatsCapacityLowerLimit;
    }

    public Integer getSeatsCapacityUpperLimit() {
        return seatsCapacityUpperLimit;
    }

}

