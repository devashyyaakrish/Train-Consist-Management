import java.util.*;

// Main Application
public class TrainAppUC15 {

    // 🔹 Custom Runtime Exception
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // 🔹 Goods Bogie Class
    static class GoodsBogie {
        String type;   // Cylindrical / Rectangular
        String cargo;

        GoodsBogie(String type) {
            this.type = type;
        }

        // 🔹 Cargo Assignment Method with Validation
        void assignCargo(String cargo) {
            try {
                // Rule: Rectangular bogie cannot carry Petroleum
                if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                    throw new CargoSafetyException("Unsafe cargo assignment: Petroleum not allowed in Rectangular bogie");
                }

                // If safe → assign cargo
                this.cargo = cargo;
                System.out.println("Cargo assigned successfully: " + cargo + " → " + type);

            } catch (CargoSafetyException e) {
                // Handle exception gracefully
                System.out.println("Error: " + e.getMessage());

            } finally {
                // Always executes
                System.out.println("Cargo assignment attempt completed for " + type + "\n");
            }
        }
    }

    // 🔹 Main Method
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // ✅ Safe assignment
        b1.assignCargo("Petroleum");

        // ❌ Unsafe assignment (handled, not crashed)
        b2.assignCargo("Petroleum");

        // ✅ Another safe assignment (program continues)
        b2.assignCargo("Grain");

        System.out.println("Program continues safely...");
    }
}