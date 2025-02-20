package gym.idea.programs;

public interface Cleaning {
        void performCleaning();  // Temizlik yapan

        String getCleaningArea(); // Temizlik yapılacak alanı

        String getCleaningSchedule();  // Temizlik zamanını

        //temizlik detayı
        default void displayCleaningInfo() {
            System.out.println("Details: Information not provided.");
        }
    }
