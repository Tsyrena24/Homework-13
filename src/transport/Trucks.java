package transport;

public class Trucks extends Transport <DriverC>{
    public Trucks(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMoving() {
        System.out.println("Марка грузовика - " + getBrand() + " " + getModel());
        System.out.println("Завожу ключ зажигания");
        System.out.println("Нажимаю на газ");
        System.out.println("Еду");
    }


    @Override
    public void finishMoving() {
        System.out.println("Марка грузовика - " +getBrand() + " " + getModel());
        System.out.println("Нажимаю на тормоз");
        System.out.println("Останавливаюсь");
        System.out.println("Выключаю ключ зажигания");
    }

    @Override
    public void pitStop() {
        System.out.println("Питстоп для грузовика" + getBrand() + " " + getModel());
    }

    @Override
    public void bestLapTime() {
        int minTime = 20;
        int maxTime = 65;
        int maxLap = (int) (minTime + (maxTime - minTime) * Math.random());
        System.out.println("Лучшее время круга для грузовика: " + getBrand() + " " + getModel() + " за " + maxLap + " минут");

    }

    @Override
    public void maxSpeedParticipant() {
        int minTime = 60;
        int maxTime = 160;
        int maxSpeed = (int) (minTime + (maxTime - minTime) * Math.random());
        System.out.println("Максимальная скорость для грузовика: " + getBrand() + " " + getModel() + " - " + maxSpeed +" км/ч");

    }


}
