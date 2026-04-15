import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainAppUC11 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Sample inputs (can be replaced with user input)
        String trainID = "TRN-1234";
        String cargoCode = "PET-AB";

        // Step 1: Define regex patterns
        String trainPatternStr = "TRN-\\d{4}";
        String cargoPatternStr = "PET-[A-Z]{2}";

        // Step 2: Compile patterns
        Pattern trainPattern = Pattern.compile(trainPatternStr);
        Pattern cargoPattern = Pattern.compile(cargoPatternStr);

        // Step 3: Create matchers
        Matcher trainMatcher = trainPattern.matcher(trainID);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Step 4: Validate using matches()
        if (trainMatcher.matches()) {
            System.out.println("Valid Train ID: " + trainID);
        } else {
            System.out.println("Invalid Train ID: " + trainID);
        }

        if (cargoMatcher.matches()) {
            System.out.println("Valid Cargo Code: " + cargoCode);
        } else {
            System.out.println("Invalid Cargo Code: " + cargoCode);
        }

        System.out.println("Program continues...");
    }
}