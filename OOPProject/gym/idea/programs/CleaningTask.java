package gym.idea.programs;

public abstract class CleaningTask {
    protected String area;  // Temizlenecek alan örnegin: Swimming Pool, fitness Area
    protected String cleaningSchedule;  // Temizlik zamanı (örneğin: Every Day, Every 2 Days)

    public CleaningTask(String area, String cleaningSchedule) {
        this.area = area;
        this.cleaningSchedule = cleaningSchedule;
    }

    // Temizlik yapılacak alan
    public abstract void performCleaning();

    // Temizlik detayları
    public void displayCleaningDetails() {
        System.out.println("Area: " + area);
        System.out.println("Schedule: " + cleaningSchedule);
    }
}