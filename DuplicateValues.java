import java.util.HashSet;
import java.util.Set;

public class DuplicateValues {
    // Function to find duplicate values in an array
    public static Set<Integer> findDuplicates(int[] array) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : array) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        // Example usage of the findDuplicates function
        int[] array = {10, 20, 30, 40, 50, 30, 40};

        // Call the function to find duplicate values
        Set<Integer> duplicates = findDuplicates(array);

        // Print the duplicate values
        System.out.println("Duplicate values: " + duplicates);
    }
}
