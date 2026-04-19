import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Step 1: Create Bogie class
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // toString() for clean output
    @Override
    public String toString() {
        return name + " -> " + capacity;
    }
}

public class TrainAppUC7 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create List of Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        // Step 3: Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));

        // Step 4: Sort using Comparator (by capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Step 5: Display sorted bogies
        System.out.println("Bogies sorted by capacity:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("Program continues...");
    }
}