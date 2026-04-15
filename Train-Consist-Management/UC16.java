import java.util.Arrays;

public class TrainAppUC16 {

    // 🔹 Bubble Sort Method
    static void bubbleSort(int[] capacities) {
        int n = capacities.length;

        // Outer loop → number of passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop → compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {

                // Swap if elements are in wrong order
                if (capacities[j] > capacities[j + 1]) {

                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }

    // 🔹 Main Method
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Input array
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Before Sorting: " + Arrays.toString(capacities));

        // Step 2: Apply Bubble Sort
        bubbleSort(capacities);

        // Step 3: Output sorted array
        System.out.println("After Sorting:  " + Arrays.toString(capacities));

        System.out.println("Program continues...");
    }
}