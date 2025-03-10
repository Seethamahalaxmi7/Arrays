public class ArraySum {
    // Function to add integer values of an array
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example usage of the sumArray function
        int[] array = {20,87,3,12,27};
        int sum = sumArray(array);
        System.out.println("The sum of the array values is: " + sum);
    }
}
