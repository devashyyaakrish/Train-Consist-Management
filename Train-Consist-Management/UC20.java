import java.util.Arrays;

public class TrainAppUC20 {

    // 🔹 Search Method with Fail-Fast Validation
    static boolean searchBogie(String[] bogieIds, String key) {

        // Step 1: Validate state (Fail-Fast)
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available for search operation");
        }

        // Step 2: Perform Linear Search
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    // 🔹 Main Method
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 🔸 Case 1: Empty dataset (will throw exception)
        String[] emptyBogies = {};

        try {
            searchBogie(emptyBogies, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 🔸 Case 2: Valid dataset
        String[] bogieIds = {"BG101", "BG205", "BG309"};

        System.out.println("\nAvailable Bogies: " + Arrays.toString(bogieIds));

        boolean found = searchBogie(bogieIds, "BG205");

        if (found) {
            System.out.println("Bogie FOUND ✅");
        } else {
            System.out.println("Bogie NOT FOUND ❌");
        }

        System.out.println("Program continues safely...");
    }
}