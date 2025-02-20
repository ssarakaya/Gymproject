package gym.idea.programs;

public class PilatesCleaning implements Cleaning {
    private Cleaner cleaner;
    private int cleaningDuration = 45;

    public PilatesCleaning(String cleanerName) {
        this.cleaner = new Cleaner(cleanerName, "Pilates Area", "Every 3 Days");
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

    public void displayCleaningInfo() {
        cleaner.displayCleaningInfo();
        System.out.println("Cleaning Duration: 45 minutes");
    }
    @Override
    public String toString() {
        return cleaner.toString();
    }
}
