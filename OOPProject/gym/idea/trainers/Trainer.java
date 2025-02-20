package gym.idea.trainers;

import gym.idea.managament.Salary;

public class Trainer {
    protected String name;
    protected int experience;
    protected String specialization;
    private Salary salary;

    public Trainer(String name, int experience, String specialization, Salary salary) {
        this.name = name;
        this.experience = experience;
        this.specialization = specialization;
        this.salary = salary;
    }

    public Salary getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }


    public String toString() {
        return "Trainer Name: " + name + "\nExperience: " + experience + " years\nSpecialization: " + specialization;
    }
}
