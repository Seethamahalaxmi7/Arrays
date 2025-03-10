public class DifferenceMinMax {
    // Method to calculate the difference between the largest and smallest values in an array
    public static int differenceMinMax(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }

        int min = array[0];
        int max = array[0];

        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        // Return the difference between the largest and smallest values
        return max - min;
    }

    public static void main(String[] args) {
        // Example usage of the differenceMinMax method
        int[] array = {10, 20, 30, 40, 50};
        
        // Call the method to get the difference between the largest and smallest values
        int difference = differenceMinMax(array);
        
        // Print the difference
        System.out.println("The difference between the largest and smallest values is: " + difference);
    }
}
