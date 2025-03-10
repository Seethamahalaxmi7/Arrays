public class ArrayElementIndex {
    // Method to locate the index of a specific element within an array
    public static int locateIndex(int[] array, int target) {
        // Iterate through the array elements
        for (int index = 0; index < array.length; index++) {
            // Check if the current element matches the target value
            if (array[index] == target) {
                // Return the index of the target value
                return index;
            }
        }
        // If the element is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Example array
        int[] numbers = {15, 25, 35, 45, 55};
        int valueToFind = 35;
        
        // Use the locateIndex method to find the index
        int index = locateIndex(numbers, valueToFind);

        // Display the index or an appropriate message
        if (index != -1) {
            System.out.println("The index of the element " + valueToFind + " is: " + index);
        } else {
            System.out.println("Element " + valueToFind + " is not present in the array.");
        }
    }
}
