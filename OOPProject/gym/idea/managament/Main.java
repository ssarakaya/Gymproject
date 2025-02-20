package gym.idea.managament;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
import gym.idea.programs.*;
import gym.idea.trainers.*;
import gym.idea.members.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Trainer Instances
        Trainer fitnessTrainer = new FitnessTrainer("Suat Ugurlu", 15, "Muscle Building", new Salary(2500, 50));
        Trainer pilatesTrainer = new PilatesTrainer("Necla Kaya", 8, "Core Strength", new Salary(1500, 30));
        Trainer combatTrainer = new CombatTrainer("Cengiz Sertkaya", 5, "MMA", new Salary(3000, 40));
        Trainer swimmingTrainer = new SwimmingTrainer("Berrin Fincan", 7, "Advanced Swimming Techniques", new Salary(2000, 40));
        Trainer[] trainers = {fitnessTrainer, pilatesTrainer, combatTrainer, swimmingTrainer};

        // Cleaning Instances
        Cleaning fitnessCleaner = new FitnessCleaning("Ayse Topal");
        Cleaning pilatesCleaner = new PilatesCleaning("Emine Ok");
        Cleaning combatCleaner = new CombatCleaning("Alperen Kara");
        Cleaning swimmingCleaner = new SwimmingCleaning("Yusuf Ak");
        Cleaning[] cleaners = {fitnessCleaner, pilatesCleaner, combatCleaner, swimmingCleaner};

        // Gym Setup
        Combat combatGym = new Combat("MMA", "Advanced");
        combatGym.addTrainer((CombatTrainer) combatTrainer);
        combatGym.addMember(new CombatMembers("Kübra Celik", 25, 105, "Combat", "Installment", "1 year", LocalDate.now(), "Boxing", "Female", "Intermediate"));
        combatGym.addMember(new CombatMembers("Alperen Daşoglu", 24, 106, "Combat", "Credit Card", "6 months", LocalDate.now(), "MMA", "Male", "Beginner"));

        Fitness fitnessGym = new Fitness("Fitness", "General");
        fitnessGym.addTrainer((FitnessTrainer) fitnessTrainer);
        fitnessGym.addMember(new FitnessMembers("Sara Kaya", 25, 101, "Fitness", "Cash", "3 months", LocalDate.now(), "Weight Loss", "Female", "Beginner"));
        fitnessGym.addMember(new FitnessMembers("Hatice Ozates", 22, 102, "Fitness", "Installment", "1 year", LocalDate.now(), "Muscle Building", "Female", "Intermediate"));

        Pilates pilatesGym = new Pilates("Core Strength", "Beginner");
        pilatesGym.addTrainer((PilatesTrainer) pilatesTrainer);
        pilatesGym.addMember(new PilatesMembers("Zkra Osman", 28, 104, "Pilates", "Cash", "3 months", LocalDate.now(), "Weight Loss", "Female", "Beginner"));

        // Diet Plan Instance
        DietPlan dietPlan = new DietPlan();

        // All Members
        ArrayList<Member> allMembers = new ArrayList<>();
        allMembers.addAll(fitnessGym.getFitnessMembers());
        allMembers.addAll(combatGym.getCombatMembers());
        allMembers.addAll(pilatesGym.getPilatesMembers());
        allMembers.add(new SwimmingMembers("Yusuf Sen", 26, 107, "Swimming", "Cash", "3 months", LocalDate.now(), "Self Improvement", "Male", "Advanced"));
        allMembers.add(new SwimmingMembers("Melih Karabulut", 23, 108, "Swimming", "Installment", "1 year", LocalDate.now(), "Learning", "Male", "Beginner"));

        // Program Manager Instance
        ProgramManager programManager = new ProgramManager();

        // Add Programs to Program Manager
        programManager.addCombatProgram(new CombatProgram("MMA Program", 12, "Advanced MMA Training"));
        programManager.addFitnessProgram(new FitnessProgram("Weight Loss Program", 10, "Fat loss and endurance program"));
        programManager.addPilatesProgram(new PilatesProgram("Core Strength Program", 6, "Strengthen your core"));
        programManager.addSwimmingProgram(new SwimmingProgram(new SwimmingMembers("Yusuf Sen", 26, 107, "Swimming", "Cash", "3 months", LocalDate.now(), "Self Improvement", "Male", "Advanced")));

        PaymentManagement management = new PaymentManagement();

        // Main Menu Logic
        System.out.println("\nWelcome!");
        boolean running = true;
        while (running) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1- Add a member");
            System.out.println("2- View member details");
            System.out.println("3- View Trainer details");
            System.out.println("4- View Cleaner details and cleaning days");
            System.out.println("5- View Gym details");
            System.out.println("6- View Salaries");
            System.out.println("7- Make Payment");
            System.out.println("8- Create Payment Plan");
            System.out.println("9- View Programs");
            System.out.println("10- View Diet Plan");
            System.out.println("11- Exit");

            int choice = 0;
            boolean validChoice = false;
            while (!validChoice) {
                try {
                    choice = scanner.nextInt();
                    scanner.nextLine(); // Clear the buffer
                    if (choice >= 1 && choice <= 11) {
                        validChoice = true;
                    } else {
                        System.out.println("Invalid choice. Please enter a number between 1 and 11.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.nextLine(); // Clear the invalid input
                }
            }

            switch (choice) {
                case 1:
                    // Add a member
                    System.out.println("Enter member details:");
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter membership type (Fitness, Combat, Swimming, Pilates): ");
                    String memberType = scanner.nextLine();
                    System.out.print("Enter payment type: ");
                    String paymentType = scanner.nextLine();
                    System.out.print("Enter membership plan: ");
                    String membershipPlan = scanner.nextLine();
                    System.out.print("Enter start date (YYYY-MM-DD): ");
                    LocalDate startDateInput = LocalDate.parse(scanner.nextLine());
                    System.out.print("Enter gender: ");
                    String gender = scanner.nextLine();
                    System.out.print("Enter Level: ");
                    String level = scanner.nextLine();

                    Member newMember = null;
                    if (memberType.equalsIgnoreCase("Fitness")) {
                        newMember = new FitnessMembers(name, age, allMembers.size() + 1, memberType, paymentType, membershipPlan, startDateInput, "Weight Loss", gender, level);
                        fitnessGym.addMember((FitnessMembers) newMember);
                    } else if (memberType.equalsIgnoreCase("Combat")) {
                        newMember = new CombatMembers(name, age, allMembers.size() + 1, memberType, paymentType, membershipPlan, startDateInput, "MMA", gender, level);
                        combatGym.addMember((CombatMembers) newMember);
                    } else if (memberType.equalsIgnoreCase("Swimming")) {
                        newMember = new SwimmingMembers(name, age, allMembers.size() + 1, memberType, paymentType, membershipPlan, startDateInput, "Endurance", gender, level);
                    } else if (memberType.equalsIgnoreCase("Pilates")) {
                        newMember = new PilatesMembers(name, age, allMembers.size() + 1, memberType, paymentType, membershipPlan, startDateInput, "Core Strength", gender, level);
                        pilatesGym.addMember((PilatesMembers) newMember);
                    }

                    if (newMember != null) {
                        allMembers.add(newMember);
                        System.out.println("New member added successfully: " + newMember);
                    } else {
                        System.out.println("Invalid member type.");
                    }
                    break;

                case 2:
                    // View member details
                    System.out.println("All Members: ");
                    for (Member member : allMembers) {
                        System.out.println(member);
                    }
                    break;

                case 3:
                    // Trainer details
                    System.out.println("Trainer Details:");
                    for (Trainer trainer : trainers) {
                        System.out.println(trainer);
                    }
                    break;

                case 4:
                    // Display cleaner info
                    for (Cleaning cleaner : cleaners) {
                        System.out.println(cleaner);
                    }
                    break;

                case 5:
                    // Display gym details and members per gym
                    System.out.println("\nCombat Gym Details:");
                    combatGym.displayGymDetails();
                    System.out.println("\nFitness Gym Details:");
                    fitnessGym.displayGymDetails();
                    System.out.println("\nPilates Gym Details:");
                    pilatesGym.displayGymDetails();
                    break;

                case 6:
                    // Display trainer salaries
                    for (Trainer trainer : trainers) {
                        System.out.println(trainer.getSalary());
                    }
                    break;

                case 7:
                    // Make payment
                    System.out.print("Payment Method: ");
                    String pMethod = scanner.nextLine();
                    System.out.print("Payment Amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    Payment p = new Payment(amount, pMethod);
                    management.addPayment(p);
                    break;

                case 8:
                    System.out.print("Payment Name: ");
                    String pName = scanner.nextLine();
                    System.out.print("Payment Duration: ");
                    String pDuration = scanner.nextLine();
                    System.out.print("Payment Amount: ");
                    double amountt = scanner.nextDouble();
                    scanner.nextLine();

                    PaymentPlan paymentPlan = new PaymentPlan(12, pName, amountt, pDuration);
                    management.addPaymentPlan(paymentPlan);
                    break;

                case 9:
                    // Display Programs
                    programManager.listCombatPrograms();
                    programManager.listFitnessPrograms();
                    programManager.listSwimmingPrograms();
                    break;

                case 10:
                    // View Diet Plan
                    System.out.print("Enter member ID to view diet plan: ");
                    int memberId = scanner.nextInt();
                    scanner.nextLine();
                    String diet = dietPlan.getDietPlanById(memberId);
                    System.out.println(diet);
                    break;

                case 11:
                    running = false;
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}