package Mechanic;
public enum MechanicProfessionalSkills {
    MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_BUS("автобус"),
    MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_TRUCKS("грузовик"),
    MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_CARS("автомобиль"),
    MECHANIC_PROFESSIONAL_SKILLS_WORKING_WITH_ALL_TRANSPORT("все виды транспорта");

    private final String professionalSkills;

    MechanicProfessionalSkills(String professionalSkills) {
        this.professionalSkills = professionalSkills;
    }

    public String getProfessionalSkills() {
        return professionalSkills;
    }


    @Override
    public String toString() {
        return  professionalSkills;
    }
}
