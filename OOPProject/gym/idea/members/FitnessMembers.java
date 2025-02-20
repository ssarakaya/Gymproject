package gym.idea.members;

import java.time.LocalDate;

public class FitnessMembers extends Member {
    private String fitnessGoal;  // "Weight Loss", "Muscle Building", etc.

    public  FitnessMembers(String name, int age, int id, String memberType, String paymentType, String membershipPlan, LocalDate startDate, String fitnessGoal, String gender, String level) {
        super(name, id, age, memberType, paymentType, membershipPlan, startDate, gender, level);
        this.fitnessGoal = fitnessGoal;
    }


    public String getFitnessGoal() {
        return fitnessGoal;
    }

    @Override
    public String toString() {
        return super.toString() + "Level: " + getLevel() + ", Goal: " + fitnessGoal;
    }
}
