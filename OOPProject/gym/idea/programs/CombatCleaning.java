package gym.idea.programs;

public class CombatCleaning implements Cleaning {
    private Cleaner cleaner;

    public CombatCleaning(String cleanerName) {
        this.cleaner = new Cleaner(cleanerName, "Combat Area", "Every 2 Days");
    }

    @Override
    public void performCleaning() {
        cleaner.performCleaning();
    }

    @Override
    public String getCleaningArea() {
        return cleaner.getCleaningArea();
    }

    @Override
    public String getCleaningSchedule() {
        return cleaner.getCleaningSchedule();
    }

    @Override
    public void displayCleaningInfo() {
        cleaner.displayCleaningInfo();
        System.out.println("Cleaning Duration: 50 minutes");
    }

    @Override
    public String toString() {
        return cleaner.toString();
    }
}
