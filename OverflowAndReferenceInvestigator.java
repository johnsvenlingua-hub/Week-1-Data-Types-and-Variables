import java.util.Arrays;

public class OverflowAndReferenceInvestigator {
    public static void main(String[] args) {

        System.out.println("=== 1. PRIMITIVE OVERFLOW ===");
        byte maxByte = 127; 
        System.out.println("Original max byte value: " + maxByte);

        maxByte++; 
        System.out.println("Value after incrementing max byte (127 + 1): " + maxByte);
        System.out.println();

        System.out.println("=== 2. STRING COMPARISONS ===");
        String str1 = new String("Java");
        String str2 = new String("Java");
        String str3 = "Java";

        // str1 vs str2 using ==
        // Result: false. WHY: Both str1 and str2 were created using 'new', allocating two separate objects in heap memory. 
        // The == operator compares memory addresses, not string values.
        System.out.println("str1 == str2: " + (str1 == str2)); 

        // str1 vs str3 using ==
        // Result: false. WHY: str3 refers to a String literal stored in the String Constant Pool, 
        // whereas str1 refers to an explicitly allocated object in general heap memory.
        System.out.println("str1 == str3: " + (str1 == str3)); 

        // String comparisons using .equals()
        // Result: true for all pairs. WHY: .equals() compares the actual character content inside the Strings, which is identical ("Java").
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println();

        System.out.println("=== 3. SHARED ARRAY REFERENCES ===");
        int[] originalArray = {10, 20, 30};
        int[] sharedArray = originalArray; 

        System.out.println("Original array before modification: " + Arrays.toString(originalArray));
        
        sharedArray[0] = 99;

        System.out.println("Shared array modified element [0] to 99.");
        System.out.println("Original array after modification via shared reference: " + Arrays.toString(originalArray));
    }
}
