import java.util.Arrays;

public class InsertElement {
    // Function to insert an element at a specific position in an array
    public static int[] insertElement(int[] array, int value, int position) {
        // Create a new array with an extra element
        int[] newArray = new int[array.length + 1];

        // Copy elements from the original array to the new array
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == position) {
                newArray[i] = value; // Insert the new element at the specified position
            } else {
                newArray[i] = array[j++]; // Copy elements from the original array
            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        // Example usage of the insertElement function
        int[] originalArray = {1, 2, 3, 4, 5};
        int valueToInsert = 10;
        int position = 2;

        // Call the function to insert the element
        int[] newArray = insertElement(originalArray, valueToInsert, position);

        // Print the new array
        System.out.println("Array after insertion: " + Arrays.toString(newArray));
    }
}
