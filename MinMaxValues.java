public class MinMaxValues {
    // Function to find the minimum and maximum values of an array
    public static int[] findMinMax(int[] array) {
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

        // Return an array containing the minimum and maximum values
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        // Example usage of the findMinMax function
        int[] array = {3,78,57,98,10};
        
        // Call the function to find the minimum and maximum values
        int[] minMax = findMinMax(array);

        // Print the minimum and maximum values
        System.out.println("The minimum value is: " + minMax[0]);
        System.out.println("The maximum value is: " + minMax[1]);
    }
}
