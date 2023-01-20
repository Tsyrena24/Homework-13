package Driver;

import java.util.Objects;
import transport.Transport;
import transport.Competing;
public abstract class Driver {
    private String fullName;
    private boolean driverLicense;
    private int experienceYear;

    public Driver(String fullName, boolean driverLicense, int experienceYear) {
        setFullName(fullName);
        this.driverLicense = driverLicense;
        setExperienceYear(experienceYear);    }



    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName == null || fullName.isEmpty()) {
            this.fullName = "Неизвестный водитель";
        } else {
            this.fullName = fullName;}
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(int experienceYear) {
        if (experienceYear <= 0) {
            this.experienceYear = 1;
        } else {
            this.experienceYear = experienceYear;
        }
    }

    public abstract void startMoving();

    public abstract void stay();

    public abstract void refuel();


    @Override
    public String toString() {
        return "Имя водителя: " + fullName +
                ", наличие водительских прав - " + (driverLicense ? "имеется" : "отсутствует") +
                ", стаж вождения - " + experienceYear + " лет";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driverLicense == driver.driverLicense && experienceYear
                == driver.experienceYear && Objects.equals(fullName, driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, driverLicense, experienceYear);
    }
}
