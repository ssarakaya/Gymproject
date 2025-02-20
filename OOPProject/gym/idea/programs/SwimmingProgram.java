package gym.idea.programs;

import gym.idea.members.SwimmingMembers;

public class SwimmingProgram {
    private SwimmingMembers swimmingMember;

    public SwimmingProgram(SwimmingMembers swimmingMember) {
        if (swimmingMember != null) {
            this.swimmingMember = swimmingMember;
        } else {
            System.out.println("This member is not a swimming member.");
        }
    }

    public void assignProgram() {
        if (swimmingMember != null) {
            System.out.println("Assigning program to: " + swimmingMember.getName());
        } else {
            System.out.println("No valid swimming member to assign a program.");
        }
    }
}

