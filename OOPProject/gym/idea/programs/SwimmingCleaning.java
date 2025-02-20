package gym.idea.programs;

public class SwimmingCleaning implements Cleaning {
    private Cleaner cleaner;

    public SwimmingCleaning(String cleanerName) {
        this.cleaner = new Cleaner(cleanerName, "Swimming Pool Area", "Every 1 Day");
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
        System.out.println("Cleaning Duration: 90 minutes");
    }

    @Override
    public String toString() {
        return cleaner.toString();
    }
}
