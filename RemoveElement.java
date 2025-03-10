import java.util.Arrays;

public class RemoveElement {
    // Function to remove a specific element from an array
    public static int[] removeElement(int[] array, int value) {
        // Count occurrences of the value to remove
        int count = 0;
        for (int num : array) {
            if (num == value) {
                count++;
            }
        }

        // Create a new array with a reduced size
        int[] newArray = new int[array.length - count];
        int index = 0;
        for (int num : array) {
            if (num != value) {
                newArray[index++] = num;
            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        // Example usage of the removeElement function
        int[] array = {10, 20, 30, 40, 50, 30};
        int valueToRemove = 20;

        // Call the function to remove the specified element
        int[] newArray = removeElement(array, valueToRemove);

        // Print the new array
        System.out.println("Array after removing " + valueToRemove + ": " + Arrays.toString(newArray));
    }
}
