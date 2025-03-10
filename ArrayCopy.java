
import java.util.Arrays;

public class ArrayCopy {
    // Function to copy an array to another array
    public static int[] copyArray(int[] originalArray) {
        int[] newArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        // Example usage of the copyArray function
        int[] originalArray = {27,3,12,11,9};
        
        // Call the function to copy the array
        int[] copiedArray = copyArray(originalArray);

        // Print the copied array
        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("Copied array: " + Arrays.toString(copiedArray));
    }
}
