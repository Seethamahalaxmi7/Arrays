public class SecondLargestNumber {
    // Method to find the second largest number in an array
    public static int findSecondLargest(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        // Example usage of the findSecondLargest method
        int[] array = {10, 20, 30, 40, 50};
        
        // Call the method to find the second largest number
        int secondLargest = findSecondLargest(array);
        
        // Print the second largest number
        System.out.println("The second largest number is: " + secondLargest);
    }
}
