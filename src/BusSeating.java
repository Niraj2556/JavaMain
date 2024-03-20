import java.util.*;

public class BusSeating {
    public static int maximumLearning(List<Integer> iv, List<Integer> articles, int p) {
        int n = iv.size();

        // Create a 2D DP array to store the maximum intellectual value for each article and pages combination
        int[][] dp = new int[n + 1][p + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= p; j++) {
                // If the current article's pages can be accommodated in the available pages
                if (articles.get(i - 1) <= j) {
                    // Choose the maximum value between reading and not reading the current article
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - articles.get(i - 1)] + iv.get(i - 1));
                } else {
                    // If the current article's pages exceed the available pages, don't read it
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][p];
    }

    public static void main(String[] args) {
        List<Integer> iv = List.of(2, 4, 4, 5);
        List<Integer> articles = List.of(2, 2, 3, 4);
        int p = 15;

        int result = maximumLearning(iv, articles, p);
        System.out.println(result);
    }
}
