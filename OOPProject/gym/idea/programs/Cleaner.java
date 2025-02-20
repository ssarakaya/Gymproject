package gym.idea.programs;

public class Cleaner extends CleaningTask implements Cleaning {
    private String name;


    public Cleaner(String name, String area, String cleaningSchedule) {
        super(area, cleaningSchedule); // gym.idea.programs.CleaningTask constructor'ını çağır
        this.name = name;
    }

    @Override
    public void performCleaning() {
        System.out.println(name + " is cleaning the " + area + ".");
    }

    @Override
    public String getCleaningArea() {
        return area;  // Temizlik yapılacak alan
    }

    @Override
    public String getCleaningSchedule() {
        return cleaningSchedule;  // Temizlik zamanı
    }


    public String getName() {
        return name;
    }

    @Override
    public void displayCleaningInfo() {
        System.out.println("Name: " + name);
        System.out.println("Area: " + area);
        System.out.println("Schedule: " + cleaningSchedule);
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nArea: " + area + "\nSchedule: " + cleaningSchedule;
    }
}
