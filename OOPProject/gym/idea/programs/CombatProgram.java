package gym.idea.programs;

public class CombatProgram {
    private String programName;
    private int durationWeeks;
    private String description;

    public CombatProgram(String programName, int durationWeeks, String description) {
        this.programName = programName;
        this.durationWeeks = durationWeeks;
        this.description = description;
    }

    public void assignProgram(String memberName) {
        System.out.println(memberName + " has been assigned to the " + programName + " program for " + durationWeeks + " weeks.");
    }

    public String toString() {
        return programName + " (" + durationWeeks + " weeks): " + description;
    }

    public String getProgramName() {
        return this.programName;
    }

    public String getProgramDetails() {
        return this.description;
    }
}
