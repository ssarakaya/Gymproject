package gym.idea.members;

import java.time.LocalDate;

public class Member {
    private String name;
    private int id;
    private int age;
    private String memberType; // "Fitness", "Pilates", "Combat", "Swimming"
    private String paymentType;
    private String membershipPlan;
    private LocalDate startDate;
    private String gender;
    private String level;

    public Member(String name, int id, int age, String memberType, String paymentType, String membershipPlan, LocalDate startDate, String gender, String level) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.memberType = memberType;
        this.paymentType = paymentType;
        this.membershipPlan = membershipPlan;
        this.startDate = startDate;
        this.gender = gender;
        this.level = level;
    }

    public String getLevel(){
        return level;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getMemberType() {
        return memberType;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public String getMembershipPlan() {
        return membershipPlan;
    }

    public LocalDate getStartDate() {
        return startDate;
    }


    public String toString() {
        return name + " (ID: " + id + ", Age: " + age + ", Type: " + memberType + ", Payment Type: " + paymentType + ", Membership Plan: " + membershipPlan + ", Gender: " + gender;

    }
}
