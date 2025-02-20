package gym.idea.managament;

import gym.idea.trainers.FitnessTrainer;
import gym.idea.members.FitnessMembers;

import java.util.ArrayList;

public class Fitness {

    private ArrayList<FitnessMembers> fitnessMembers;
    private ArrayList<FitnessTrainer> fitnessTrainers;
    private String gymName;
    private String gymType;

    public Fitness(String gymName, String gymType) {
        this.fitnessMembers = new ArrayList<>();
        this.fitnessTrainers = new ArrayList<>();
        this.gymName = gymName;
        this.gymType = gymType;
    }

    // Fitness üyelerini ekler
    public void addMember(FitnessMembers member) {
        fitnessMembers.add(member);
    }

    // Fitness antrenörlerini ekler
    public void addTrainer(FitnessTrainer trainer) {
        fitnessTrainers.add(trainer);
    }

    // Fitness üyelerini döndüren metod
    public ArrayList<FitnessMembers> getFitnessMembers() {
        return fitnessMembers;
    }

    public String getGymName() {
        return gymName;
    }
    public String getGymType() {
        return gymType;
    }

    // Fitness antrenörlerini listeleyen metod
    public void listTrainers() {
        System.out.println("Fitness Trainers: ");
        for (FitnessTrainer trainer : fitnessTrainers) {
            System.out.println(trainer);
        }
    }

    // Fitness üyelerini listeleyen metod
    public void listMembers() {
        System.out.println("Fitness Members: ");
        for (FitnessMembers member : fitnessMembers) {
            System.out.println(member);
        }
    }

    // Spor salonu detaylarını gösteren metod
    public void displayGymDetails() {
        listMembers();
        listTrainers();
    }
}