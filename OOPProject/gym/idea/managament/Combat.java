package gym.idea.managament;

import gym.idea.trainers.CombatTrainer;
import gym.idea.members.CombatMembers;

import java.util.ArrayList;

public class Combat {

    private ArrayList<CombatMembers> combatMembers;
    private ArrayList<CombatTrainer> combatTrainers;
    private String gymName;
    private String gymType;

    public Combat(String gymName, String gymType) {
        this.gymName = gymName;
        this.gymType = gymType;
        this.combatMembers = new ArrayList<>();
        this.combatTrainers = new ArrayList<>();
    }

    // Combat üyelerini +
    public void addMember(CombatMembers member) {
        combatMembers.add(member);
    }

    // Combat antrenörlerini +
    public void addTrainer(CombatTrainer trainer) {
        combatTrainers.add(trainer);
    }

    // Combat üyelerini yazsın
    public ArrayList<CombatMembers> getCombatMembers() {
        return combatMembers; }
    // Combat antrenörlerini yazsın
    public void listTrainers() {
        System.out.println("Combat Trainers: ");
        for (CombatTrainer trainer : combatTrainers) {
            System.out.println(trainer);
        }
    }

    // gym.idea.managament.Combat üyelerini döndüren metod
    public void listMembers() {
        System.out.println("Combat Members: ");
        for (CombatMembers member : combatMembers) {
            System.out.println(member);
        }
    }

    public void displayGymDetails() {
        System.out.println("Gym Name: " + gymName);
        System.out.println("Gym Type: " + gymType);
        listMembers();
        listTrainers();
    }
}
