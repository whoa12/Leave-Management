import java.util.*;

public class BinaryRepresentationSubset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input non-negative integer N
        long N = scanner.nextLong();

        List<Long> result = new ArrayList<>();

        // Convert N to its binary representation
        String binaryN = Long.toBinaryString(N);

        // Calculate the maximum number of bits needed
        int maxBits = binaryN.length();

        // Iterate through all non-negative integers x
        for (long x = 0; x < (1L << maxBits); x++) {
            // Convert x to its binary representation
            String binaryX = Long.toBinaryString(x);

            // Check if x satisfies the condition
            if (isSubset(binaryX, binaryN)) {
                result.add(x);
            }
        }

        // Print the result in ascending order
        for (long x : result) {
            System.out.println(x);
        }
    }

    // Function to check if binaryX is a subset of binaryY
    private static boolean isSubset(String binaryX, String binaryY) {
        int lenX = binaryX.length();
        int lenY = binaryY.length();

        // Pad binaryX with leading zeros if needed
        if (lenX < lenY) {
            binaryX = "0".repeat(lenY - lenX) + binaryX;
        }

        // Check if binaryX is a subset of binaryY
        for (int i = 0; i < lenY; i++) {
            if (binaryX.charAt(i) == '1' && binaryY.charAt(i) == '0') {
                return false;
            }
        }

        return true;
}
}
