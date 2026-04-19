import java.util.LinkedList;

public class TrainAppUC4 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // Step 2: Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train: " + train);

        // Step 3: Insert Pantry Car at position 2 (index 1-based -> index 1)
        train.add(2, "Pantry");
        System.out.println("After adding Pantry at position 2: " + train);

        // Step 4: Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        // Step 5: Final train consist
        System.out.println("Final Train Consist: " + train);

        System.out.println("Program continues...");
    }
}