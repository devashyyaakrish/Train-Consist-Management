import java.util.Arrays;

public class TrainAppUC17 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Input array of bogie names
        String[] bogieNames = {
            "Sleeper",
            "AC Chair",
            "First Class",
            "General",
            "Luxury"
        };

        System.out.println("Before Sorting: " + Arrays.toString(bogieNames));

        // Step 2: Use built-in sorting
        Arrays.sort(bogieNames);

        // Step 3: Output sorted array
        System.out.println("After Sorting:  " + Arrays.toString(bogieNames));

        System.out.println("Program continues...");
    }
}