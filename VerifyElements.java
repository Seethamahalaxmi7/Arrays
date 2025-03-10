public class VerifyElements {
    // Method to verify if the array contains two specified elements (12 and 23)
    public static boolean containsElements(int[] array, int element1, int element2) {
        boolean containsElement1 = false;
        boolean containsElement2 = false;

        for (int num : array) {
            if (num == element1) {
                containsElement1 = true;
            }
            if (num == element2) {
                containsElement2 = true;
            }
        }

        // Return true if both elements are found, otherwise return false
        return containsElement1 && containsElement2;
    }

    public static void main(String[] args) {
        // Example usage of the containsElements method
        int[] array = {5, 10, 12, 23, 35, 45};
        int element1 = 12;
        int element2 = 23;

        // Call the method to verify if the array contains the specified elements
        boolean result = containsElements(array, element1, element2);

        // Print the result
        if (result) {
            System.out.println("The array contains both elements " + element1 + " and " + element2);
        } else {
            System.out.println("The array does not contain both elements " + element1 + " and " + element2);
        }
    }
}
