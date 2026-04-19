import java.util.HashMap;
import java.util.Map;

public class TrainAppUC6 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create HashMap for bogie-capacity mapping
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Step 2: Insert bogie capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 24);

        // Step 3: Display bogie-capacity mapping
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("Program continues...");
    }
}