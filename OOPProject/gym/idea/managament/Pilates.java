package gym.idea.managament;

import gym.idea.trainers.PilatesTrainer;
import gym.idea.members.PilatesMembers;

import java.util.ArrayList;

public class Pilates {

    private ArrayList<PilatesMembers> pilatesMembers;
    private ArrayList<PilatesTrainer> pilatesTrainers;
    private String coreStrength;
    private String beginner;

    public Pilates(String coreStrength, String beginner) {
        this.pilatesMembers = new ArrayList<>();
        this.pilatesTrainers = new ArrayList<>();
        this.coreStrength = coreStrength;
        this.beginner = beginner;
    }

    // Üye ekleme
    public void addMember(PilatesMembers member) {
        pilatesMembers.add(member);
    }

    // Antrenör ekleme
    public void addTrainer(PilatesTrainer trainer) {
        pilatesTrainers.add(trainer);
    }

    // Pilates üyelerini döndüren metod
    public ArrayList<PilatesMembers> getPilatesMembers() {
        return pilatesMembers;
    }

    // Pilates antrenörlerini döndüren metod
    public ArrayList<PilatesTrainer> getPilatesTrainers() {
        return pilatesTrainers;
    }

    public String getCoreStrength() {
        return coreStrength;
    }
    public String getBeginner() {
        return beginner;
    }

    // Üyeleri listele
    public void listMembers() {
        System.out.println("Pilates Members:");
        for (PilatesMembers member : pilatesMembers) {
            System.out.println(member);
        }
    }

    // Antrenörleri listele
    public void listTrainers() {
        System.out.println("Pilates Trainers:");
        for (PilatesTrainer trainer : pilatesTrainers) {
            System.out.println(trainer);
        }
    }

    // Pilates sınıf detaylarını göster
    public void displayGymDetails() {
        System.out.println("Pilates Gym Details:");
        listMembers();
        listTrainers();
    }
}
