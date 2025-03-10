public class ArrayAverage {
    // Function to calculate the average value of an array of integers
    public static double averageArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        // Example usage of the averageArray function
        int[] array = {27,3,12,11,78};
        double average = averageArray(array);
        System.out.println("The average value of the array is: " + average);
    }
}
