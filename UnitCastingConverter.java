public class UnitCastingConverter {
    public static void main(String[] args) {
        double totalCentimeters = 275.8;

        // Explicit narrowing cast to compute WHOLE meters and remaining centimeters
        int wholeMeters = (int) (totalCentimeters / 100);
        double remainingCentimeters = totalCentimeters % 100;

        System.out.println("=== UNIT CONVERTER ===");
        System.out.println("Total Input: " + totalCentimeters + " cm");
        System.out.println("Converted Result: " + wholeMeters + " m and " + remainingCentimeters + " cm");
        System.out.println();

        // Demonstration 1: Implicit Widening (int to double)
        int wholeNumber = 42;
        // Implicit widening happens automatically because double (64-bit) has a larger range than int (32-bit).
        // No explicit cast like (double) is required because no loss of data can occur.
        double widenedNumber = wholeNumber; 

        System.out.println("=== IMPLICIT WIDENING DEMO ===");
        System.out.println("Original int value: " + wholeNumber);
        System.out.println("Widened double value: " + widenedNumber);
        System.out.println();

        // Demonstration 2: Explicit Narrowing (double to int)
        double decimalMeasurement = 15.89;
        // Explicit narrowing requires the syntax (int).
        // Data lost: The entire fractional part (.89) is truncated/discarded, reducing 15.89 to 15.
        int truncatedMeasurement = (int) decimalMeasurement; 

        System.out.println("=== EXPLICIT NARROWING DEMO ===");
        System.out.println("Original double value: " + decimalMeasurement);
        System.out.println("Narrowed int value: " + truncatedMeasurement);
    }
}
