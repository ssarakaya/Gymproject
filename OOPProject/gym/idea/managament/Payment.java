package gym.idea.managament;

public class Payment {
    private double amount; // Ödeme miktarı
    private String paymentMethod; // Ödeme türü (nakit, kredi kartı, taksit olabilir)

    public Payment(double amount, String paymentMethod) {
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be greater than zero.");
            }
            this.amount = amount;

            if (paymentMethod == null || paymentMethod.trim().isEmpty()) {
                throw new IllegalArgumentException("Payment method cannot be empty.");
            }
            this.paymentMethod = paymentMethod.trim();
        } catch (IllegalArgumentException e) {
            System.out.println("Error in constructor: " + e.getMessage());
        }
        finally {
            System.out.println("---");
        }
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    // Ödeme detaylarını ekrana yazdırma
    public void displayPaymentDetails() {
        System.out.println("Payment Amount: " + amount);
        System.out.println("Payment Method: " + paymentMethod);
    }
}
