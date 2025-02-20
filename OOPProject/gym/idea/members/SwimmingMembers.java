package gym.idea.members;

import java.time.LocalDate;

public class SwimmingMembers extends Member {
    private String swimGoal;   // "Endurance", "Speed", etc.

    public SwimmingMembers(String name, int age, int id, String memberType, String paymentType, String membershipPlan, LocalDate startDate, String swimGoal, String gender,String level) {
        super(name, id, age, memberType, paymentType, membershipPlan, startDate, gender, level);
        this.swimGoal = swimGoal;
    }


    public String getSwimGoal() {
        return swimGoal;
    }

    @Override
    public String toString() {
        return super.toString() + "Level: " + getLevel() + ", Goal: " + swimGoal;
    }
}
