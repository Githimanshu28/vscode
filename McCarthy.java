import java.util.Scanner;
public class McCarthy {

    public static int mcCarthy(int n) {
        if (n > 100) {
            return n - 10;
        } else {
            return mcCarthy(mcCarthy(n + 11));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int result = mcCarthy(number);
        System.out.println("The result of the McCarthy 91 function is: " + result);
        scanner.close();
    }
}