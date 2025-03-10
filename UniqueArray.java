import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueArray {
    // Method to remove duplicate elements from an array
    public static int[] removeDuplicates(int[] array) {
        // Use a LinkedHashSet to maintain order and remove duplicates
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : array) {
            set.add(num);
        }

        // Convert the set back to an array
        int[] newArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            newArray[index++] = num;
        }

        return newArray;
    }

    public static void main(String[] args) {
        // Example usage of the removeDuplicates method
        int[] array = {10, 20, 30, 20, 40, 50, 30};
        
        // Call the method to remove duplicates
        int[] newArray = removeDuplicates(array);
        
        // Print the array without duplicates
        System.out.println("Array without duplicates: " + Arrays.toString(newArray));
    }
}
