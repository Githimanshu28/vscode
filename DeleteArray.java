import java.util.*;

public class DeleteArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Delete first element by shifting elements left
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--; // reduce size

        System.out.println("After deleting first element:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


