package gym.idea.managament;

import java.util.ArrayList;

public class PaymentManagement {
    private ArrayList<Payment> payments;
    private ArrayList<PaymentPlan> paymentPlans;

    // Constructor
    public PaymentManagement() {
        payments = new ArrayList<>();
        paymentPlans = new ArrayList<>();
    }

    // Add payment
    public void addPayment(Payment payment) {
        if (payment != null && payment.getAmount() > 0) {
            payments.add(payment);
            System.out.println("Payment added successfully.");
        } else {
            System.out.println("Invalid payment.");
        }
    }

    // Tutara göre ödeme bulma
    public Payment findPaymentByAmount(double amount) {
        for (Payment payment : payments) {
            if (payment.getAmount() == amount) {
                return payment;
            }
        }
        return null;
    }

    public void displayAllPayments() {
        if (payments.isEmpty()) {
            System.out.println("No payments found.");
        } else {
            for (Payment payment : payments) {
                payment.displayPaymentDetails();
                System.out.println("-----");
            }
        }
    }

    public void removePayment(Payment payment) {
        if (payments.remove(payment)) {
            System.out.println("Payment removed successfully.");
        } else {
            System.out.println("Payment not found.");
        }
    }

    public double calculateTotalPayments() {
        double total = 0;
        for (Payment payment : payments) {
            total += payment.getAmount();
        }
        return total;
    }

    public void addPaymentPlan(PaymentPlan paymentPlan) {
        if (paymentPlan != null) {
            paymentPlans.add(paymentPlan);
            System.out.println("Payment Plan added.");
        } else {
            System.out.println("Payment Plan cannot be null.");
        }
    }

    public void showPaymentDetails(int planId) {
        for (PaymentPlan plan : paymentPlans) {
            if (plan.getPlanId() == planId) {
                System.out.println(plan);
                return;
            }
        }
        System.out.println("Payment Plan not found.");
    }
}
