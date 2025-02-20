package gym.idea.programs;

import gym.idea.members.Member;

public class PilatesProgram {
    private Member member;

    // Constructor to initialize the member
    public PilatesProgram(Member member) {
        this.member = member;
    }

    public PilatesProgram(String pilatesProgram, int i, String s) {
    }

    // Üye seviyesine göre program belirleme
    public void assignProgram() {
        String level = member.getLevel();  // Get the member's level using the getter
        if (level == null || level.isEmpty()) {
            System.out.println("Member " + member.getName() + " has no valid level.");
            return;
        }

        switch (level.toLowerCase()) {  // Using toLowerCase() for case-insensitive comparison
            case "beginner":
                System.out.println(member.getName() + " assigned to Pilates Beginner Program.");
                break;
            case "intermediate":
                System.out.println(member.getName() + " assigned to Pilates Intermediate Program.");
                break;
            case "advanced":
                System.out.println(member.getName() + " assigned to Pilates Advanced Program.");
                break;
            default:
                System.out.println("No valid Pilates program found for " + member.getName() + ".");
        }
    }
}
