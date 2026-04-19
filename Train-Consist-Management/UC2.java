import java.util.ArrayList;
import java.util.List;

public class TrainAppUC2 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create ArrayList for passenger bogies
        List<String> bogies = new ArrayList<>();

        // Step 2: Add passenger bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Step 3: Display bogies after insertion
        System.out.println("Bogies after addition: " + bogies);

        // Step 4: Remove one bogie (AC Chair)
        bogies.remove("AC Chair");
        System.out.println("After removing AC Chair: " + bogies);

        // Step 5: Check existence of Sleeper
        if (bogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the train.");
        } else {
            System.out.println("Sleeper bogie not found.");
        }

        // Step 6: Final state of list
        System.out.println("Final bogie list: " + bogies);

        System.out.println("Program continues...");
    }
}