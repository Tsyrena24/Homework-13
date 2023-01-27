package Mechanic;

import transport.Transport;

import java.util.ArrayList;
import java.util.List;

public class Mechanic{
    private String fullName;
    private String mechanicsСompany;
    private final MechanicProfessionalSkills professionalSkills;
    private  List <Class <? extends Transport<?>>> carType = new ArrayList<>();


    public Mechanic(String fullName, String mechanicsСompany, MechanicProfessionalSkills professionalSkills) {
        setFullName(fullName);
        setMechanicsСompany(mechanicsСompany);
        this.professionalSkills = professionalSkills;

    }

    public List<Class<? extends Transport<?>>> getCarType() {
        return carType;
    }

    public MechanicProfessionalSkills getProfessionalSkills() {
        return professionalSkills;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName != null && !fullName.isEmpty() && !fullName.isBlank()) {
            this.fullName = fullName;
        } else {
            throw new RuntimeException("Ошибка! У механика должно быть имя и фамилия.");
        }
    }


    public String getMechanicsСompany() {
        return mechanicsСompany;
    }

    public void setMechanicsСompany(String mechanicsСompany) {
        if (mechanicsСompany != null && !mechanicsСompany.isEmpty() && !mechanicsСompany.isBlank()) {
            this.mechanicsСompany = mechanicsСompany;
        } else {
            throw new RuntimeException("Ошибка! Не назначена компания, в которой работает механик " + getFullName() + ".");
        }
    }

    public void addCarType(Class<? extends Transport<?>> carType) {
        this.carType.add(carType);
    }

    public void carryOutMaintenance(Transport<?> transport) {
        if (this.carType.contains(transport.getClass())) {
            System.out.println("Механик " + getFullName() + " проводит техобслуживание транспорта: "
                    + professionalSkills + ", " + transport.getClass().getSimpleName() +" "+ transport.getBrand()
                    + " " + transport.getModel());
        } else {
            System.out.format("Механик %s не умеет работать с %s %n",
                    getFullName(),  transport.getClass().getSimpleName());
        }
    }

    public void repairTheCar(Transport<?> transport) {
        if (this.carType.contains(transport.getClass())) {
            System.out.println("Механик " + getFullName() + " чинит "
                    + professionalSkills + ", " + transport.getClass().getSimpleName() +" "+ transport.getBrand()
                    + " " + transport.getModel());
        } else {
            System.out.format("Механик %s не умеет работать с %s %n",
                    getFullName(),  transport.getClass().getSimpleName());
        }}

    @Override
    public String toString() {
        return "Механик: " + fullName +
                ", работает в компании " + mechanicsСompany + ", имеет навык работы с транспортом -  " + professionalSkills;
    }
}
