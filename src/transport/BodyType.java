package transport;

public enum BodyType {
    BODY_TYPE_SEDAN("Седан"),
    BODY_TYPE_HATCHBACK("Хэтчбек"),
    BODY_TYPE_COUPE("Купе"),
    BODY_TYPE_STATION_WAGON("Универсал"),
    BODY_TYPE_SUV("Внедорожник"),
    BODY_TYPE_CROSSOVER("Кроссовер"),
    BODY_TYPE_PICKUP("Пикап"),
    BODY_TYPE_VAN("Фургон"),
    BODY_TYPE_MINIVAN("Минивэн");

    private final String bodyType;

    BodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    @Override
    public String toString() {
        return ", тип кузова - " + bodyType;
    }
}

