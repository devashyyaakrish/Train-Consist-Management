import java.util.Arrays;

public class TrainAppUC18 {

    // 🔹 Linear Search Method
    static boolean linearSearch(String[] bogieIds, String key) {

        for (int i = 0; i < bogieIds.length; i++) {

            // Compare using equals() for Strings
            if (bogieIds[i].equals(key)) {
                return true; // Match found → stop early
            }
        }

        return false; // No match found
    }

    // 🔹 Main Method
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Unsorted array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        System.out.println("Available Bogies: " + Arrays.toString(bogieIds));

        // Step 2: Search key
        String searchKey = "BG309";

        // Step 3: Perform search
        boolean found = linearSearch(bogieIds, searchKey);

        // Step 4: Display result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND ✅");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND ❌");
        }

        System.out.println("Program continues...");
    }
}