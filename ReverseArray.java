import java.util.Arrays;

public class ReverseArray {
    // Function to reverse an array of integer values
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        
        while (start < end) {
            // Swap the elements at the start and end indexes
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            
            // Move the start and end indexes towards the middle
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // Example usage of the reverseArray function
        int[] array = {10, 20, 30, 40, 50};
        
        // Call the function to reverse the array
        reverseArray(array);

        // Print the reversed array
        System.out.println("Reversed array: " + Arrays.toString(array));
    }
}
