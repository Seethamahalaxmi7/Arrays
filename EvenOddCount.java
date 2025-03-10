public class EvenOddCount {
    // Method to count the number of even and odd numbers in an array
    public static int[] countEvenOdd(int[] array) {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Return an array containing the counts of even and odd numbers
        return new int[]{evenCount, oddCount};
    }

    public static void main(String[] args) {
        // Example usage of the countEvenOdd method
        int[] array = {10, 21, 32, 43, 54, 65, 76};
        
        // Call the method to count even and odd numbers
        int[] evenOddCounts = countEvenOdd(array);

        // Print the counts of even and odd numbers
        System.out.println("Number of even numbers: " + evenOddCounts[0]);
        System.out.println("Number of odd numbers: " + evenOddCounts[1]);
    }
}
