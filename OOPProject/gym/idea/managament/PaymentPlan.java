package gym.idea.managament;

public class PaymentPlan {
    private int planId;
    private String planName;
    private double totalAmount;
    private String duration;

    // Constructor that accepts 4 parameters
    public PaymentPlan(int planId, String planName, double totalAmount, String duration) {
        this.planId = planId;
        this.planName = planName;
        this.totalAmount = totalAmount;
        this.duration = duration;
    }

    // Getters and Setters
    public int getPlanId() {
        return planId;
    }

    public String getPlanName() {
        return planName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getDuration() {
        return duration;
    }


    @Override
    public String toString() {
        return "PaymentPlan ID: " + planId + ", Plan: " + planName + ", Total Amount: " + totalAmount + ", Duration: " + duration;
    }
}

