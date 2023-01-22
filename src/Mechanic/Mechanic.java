package Mechanic;

import transport.Transport;

public class Mechanic{
    private String fullName;
    private String mechanicsСompany;
    private final MechanicProfessionalSkills professionalSkills;


    public Mechanic(String fullName, String mechanicsСompany, MechanicProfessionalSkills professionalSkills) {
        setFullName(fullName);
        setMechanicsСompany(mechanicsСompany);
        this.professionalSkills = professionalSkills;

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





    public void carryOutMaintenance(Transport transport) {
        System.out.println("Механик " + getFullName() + " проводит техобслуживание транспорта: "
                + professionalSkills + ", " + transport.getBrand() +" "+ transport.getModel());
    }

    public void repairTheCar(Transport transport) {
        System.out.println(getFullName()+" чинит транспорт: " +
                 professionalSkills + ", " + transport.getBrand() +" "+ transport.getModel());

    }

    @Override
    public String toString() {
        return "Механик: " + fullName +
                ", работает в компании " + mechanicsСompany + ", имеет навык работы с транспортом -  " + professionalSkills;
    }
}
