import java.util.Scanner;

public class great_arr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter " + n + " elements of array ");
        int max = 0;
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = sc.nextInt();
        }
        for (int idx = 0; idx < arr.length; idx++) {
            int elem = arr[idx];
            if (max < elem) {
                max = elem;
            }
        }
        System.out.print("Max Element in array: " + max);
    }
}