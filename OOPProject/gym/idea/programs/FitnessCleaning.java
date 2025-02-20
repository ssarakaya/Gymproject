package gym.idea.programs;

public class FitnessCleaning implements Cleaning {
    private Cleaner cleaner;

    public FitnessCleaning(String cleanerName) {
        this.cleaner = new Cleaner(cleanerName, "Fitness Area", "Every 2 Days");
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
        System.out.println("Cleaning Duration: 60 minutes");
    }

    @Override
    public String toString() {
        return cleaner.toString();
    }
}
