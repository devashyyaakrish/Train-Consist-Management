import java.util.Arrays;

public class TrainAppUC19 {

    // 🔹 Binary Search Method
    static boolean binarySearch(String[] bogieIds, String key) {

        int left = 0;
        int right = bogieIds.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            int comparison = bogieIds[mid].compareTo(key);

            if (comparison == 0) {
                return true; // Found
            } 
            else if (comparison < 0) {
                left = mid + 1; // Search right half
            } 
            else {
                right = mid - 1; // Search left half
            }
        }

        return false; // Not found
    }

    // 🔹 Main Method
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Sorted array (IMPORTANT)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        System.out.println("Sorted Bogies: " + Arrays.toString(bogieIds));

        // Step 2: Search key
        String searchKey = "BG309";

        // Step 3: Perform binary search
        boolean found = binarySearch(bogieIds, searchKey);

        // Step 4: Display result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND ✅");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND ❌");
        }

        System.out.println("Program continues...");
    }
}