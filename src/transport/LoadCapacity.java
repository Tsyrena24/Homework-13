package transport;

public enum LoadCapacity {
    LOAD_CAPACITY_N1(0D, 3.5),
    LOAD_CAPACITY_N2(3.5, 12D),
    LOAD_CAPACITY_N3(12D, null);

    private final Double loadCapacityLowerLimit;
    private final Double loadCapacityUpperLimit;

    LoadCapacity(Double loadCapacityLowerLimit, Double loadCapacityUpperLimit) {
        this.loadCapacityLowerLimit = loadCapacityLowerLimit;
        this.loadCapacityUpperLimit = loadCapacityUpperLimit;
    }

    public Double getLoadCapacityLowerLimit() {
        return loadCapacityLowerLimit;
    }

    public Double getLoadCapacityUpperLimit() {
        return loadCapacityUpperLimit;
    }

}
