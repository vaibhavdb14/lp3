
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1, c;
        int steps = 0;

        System.out.print("Fibonacci Series: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            steps++; // Printing step

            c = a + b;
            steps++; // Addition step

            a = b;
            steps++; // Assignment step

            b = c;
            steps++; // Assignment step
        }

        System.out.println("\nTotal computational steps: " + steps);

        sc.close();
    }
}
