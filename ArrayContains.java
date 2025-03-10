public class ArrayContains {
    // Function to check if an array contains a specific value
    public static boolean containsValue(int[] array, int value) {
        for (int num : array) {
            if (num == value) {
                return true; // Return true if the value is found
            }
        }
        return false; // Return false if the value is not found
    }

    public static void main(String[] args) {
        // Example usage of the containsValue function
        int[] array = {10, 20, 30, 40, 50};
        int valueToFind = 30;
        
        // Check if the array contains the specified value
        boolean result = containsValue(array, valueToFind);
        
        if (result) {
            System.out.println("The array contains the value " + valueToFind);
        } else {
            System.out.println("The array does not contain the value " + valueToFind);
        }
    }
}
