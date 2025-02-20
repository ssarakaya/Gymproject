package gym.idea.programs;

public class FitnessProgram {
    private String programName;
    private int durationWeeks;
    private String description;


    public FitnessProgram(String programName, int durationWeeks, String description) {
        if (durationWeeks < 1) {
            throw new IllegalArgumentException("Duration must be at least 1 week.");
        }
        this.programName = programName;
        this.durationWeeks = durationWeeks;
        this.description = description;
    }


    public String getProgramName() {
        return programName;
    }

    public int getDurationWeeks() {
        return durationWeeks;
    }

    public String getDescription() {
        return description;
    }


    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public void setDurationWeeks(int durationWeeks) {
        if (durationWeeks < 1) {
            throw new IllegalArgumentException("Duration must be at least 1 week.");
        }
        this.durationWeeks = durationWeeks;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return programName + " (" + durationWeeks + " weeks): " + description;
    }
}
