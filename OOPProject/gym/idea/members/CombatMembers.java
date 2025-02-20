package gym.idea.members;

import java.time.LocalDate;

public class CombatMembers extends Member {
    private String combatStyle; // "Boxing", "MMA", etc.

    public CombatMembers(String name, int age, int id, String memberType, String paymentType, String membershipPlan, LocalDate startDate, String combatStyle, String gender,String level) {
        super(name, id, age, memberType, paymentType, membershipPlan, startDate, gender,level);
        this.combatStyle = combatStyle;

    }

    public String getCombatStyle() {
        return combatStyle;
    }



    @Override
    public String toString() {
        return super.toString() + "Level: " + getLevel() + " - Combat Style: " + combatStyle ;
    }
}
