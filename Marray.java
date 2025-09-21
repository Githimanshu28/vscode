public class Marray {
    
    public static int recursiveSum(int[] arr, int n) {
        if (n <= 0) {
            return 0;  
        }
        return recursiveSum(arr, n - 1) + arr[n - 1];  
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5};
        int n = 5;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = recursiveSum(arr, arr.length);

        int missing = expectedSum - actualSum;
        System.out.println("Missing number: " + missing);
    }
}