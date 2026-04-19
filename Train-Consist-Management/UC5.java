import java.util.LinkedHashSet;
import java.util.Set;

public class TrainAppUC5 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create LinkedHashSet for train formation
        Set<String> train = new LinkedHashSet<>();

        // Step 2: Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Step 3: Attempt to add duplicate
        train.add("Sleeper"); // duplicate (ignored automatically)

        // Step 4: Display final formation
        System.out.println("Train Formation: " + train);

        System.out.println("Program continues...");
    }
}