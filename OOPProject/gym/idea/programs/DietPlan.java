package gym.idea.programs;

import java.util.HashMap;
import java.util.Map;

public class DietPlan {
    private Map<Integer, String> memberDietPlans;

    public DietPlan() {
        memberDietPlans = new HashMap<>();
        memberDietPlans.put(101, "Diet Plan for Sara Kaya: High protein, low carb.");
        memberDietPlans.put(102, "Diet Plan for Hatice Ozates: Balanced diet for muscle building.");
        memberDietPlans.put(103, "Diet Plan for Ebrar Erol: Endurance-focused diet.");
    }

    public String getDietPlanById(int memberId) {
        return memberDietPlans.getOrDefault(memberId, "Diet plan not available for this member.");
    }

    public void showDietPlan(String memberName) {
        System.out.println("Diet Plan for " + memberName + ": [details]");
    }
}
