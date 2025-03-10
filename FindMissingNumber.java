public class FindMissingNumber {
    public static int findMissingNumber(int[] array) {
        int n = array.length + 1; // Including the missing number
        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int actualSum = 0;

        for (int num : array) {
            actualSum += num;
        }

        return expectedSum - actualSum; // The difference is the missing number
    }

    public static void main(String[] args) {
        int[] array = new int[99];
        int missingNumber = 37; // Example missing number

        for (int i = 0, j = 1; j <= 100; j++) {
            if (j != missingNumber) {
                array[i++] = j;
            }
        }

        System.out.println("The missing number is: " + findMissingNumber(array));
    }
}
