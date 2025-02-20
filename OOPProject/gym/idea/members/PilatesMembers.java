package gym.idea.members;

import java.time.LocalDate;

public class PilatesMembers extends Member {
    private String pilatesGoal;      // "Core Strength", "Balance", etc.

    public PilatesMembers(String name, int age, int id, String memberType, String paymentType, String membershipPlan, LocalDate startDate, String pilatesGoal, String gender,String level) {
        super(name, id, age, memberType, paymentType, membershipPlan, startDate, gender,level);
        this.pilatesGoal = pilatesGoal;
    }


    public String getPilatesGoal() {
        return pilatesGoal;
    }

    @Override
    public String toString() {
        return super.toString() + "Level: " + getLevel() +  ", Goal: " + pilatesGoal;
    }
}
