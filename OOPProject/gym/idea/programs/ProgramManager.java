package gym.idea.programs;
import java.util.ArrayList;

public class ProgramManager {
    private ArrayList<CombatProgram> combatPrograms;
    private ArrayList<FitnessProgram> fitnessPrograms;
    private ArrayList<PilatesProgram> pilatesPrograms;
    private ArrayList<SwimmingProgram> swimmingPrograms;

    public ProgramManager() {
        this.combatPrograms = new ArrayList<>();
        this.fitnessPrograms = new ArrayList<>();
        this.pilatesPrograms = new ArrayList<>();
        this.swimmingPrograms = new ArrayList<>();
    }

    // Combat Program Management
    public void addCombatProgram(CombatProgram program) {
        combatPrograms.add(program);
    }

    public void listCombatPrograms() {
        System.out.println("Combat Programs:");
        for (CombatProgram program : combatPrograms) {
            System.out.println(program);
        }
    }

    // Fitness Program Management
    public void addFitnessProgram(FitnessProgram program) {
        fitnessPrograms.add(program);
    }

    public void listFitnessPrograms() {
        System.out.println("Fitness Programs:");
        for (FitnessProgram program : fitnessPrograms) {
            System.out.println(program);
        }
    }

    // Pilates Program Management
    public void addPilatesProgram(PilatesProgram program) {
        pilatesPrograms.add(program);
    }

    public void listPilatesPrograms() {
        System.out.println("Pilates Programs:");
        for (PilatesProgram program : pilatesPrograms) {
            program.assignProgram();
        }
    }

    // Swimming Program Management
    public void addSwimmingProgram(SwimmingProgram program) {
        swimmingPrograms.add(program);
    }

    public void listSwimmingPrograms() {
        System.out.println("Swimming Programs:");
        for (SwimmingProgram program : swimmingPrograms) {
            program.assignProgram();
        }
    }
}
