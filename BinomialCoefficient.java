
import java.util.Scanner;

public class BinomialCoefficient {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter r: ");
        int r = sc.nextInt();

        int dp[][] = new int[n + 1][r + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, r); j++) {

                if (j == 0 || j == i) {
                    dp[i][j] = 1;
                }
                else {
                    dp[i][j] = dp[i - 1][j - 1]
                             + dp[i - 1][j];
                }
            }
        }

        System.out.println("Binomial Coefficient: " + dp[n][r]);

        sc.close();
    }
}
