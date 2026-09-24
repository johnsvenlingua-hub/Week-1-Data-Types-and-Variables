public class ShoppingCalculator {
    public static void main(String[] args) {
        String storeName = "Tech Corner";
        int quantity = 3;
        double unitPrice = 24.99;

        /* Note: totalCost must be double because multiplying an int by a double yields a double.
         If declared as an int, decimal precision (cents) would be lost or cause a compilation error. */
        double totalCost = quantity * unitPrice;

        System.out.println("=== ITEMIZATION SUMMARY ===");
        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: $" + unitPrice);
        System.out.println("Total Cost: $" + totalCost);
    }
}
