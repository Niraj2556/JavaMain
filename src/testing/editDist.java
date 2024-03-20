package testing;
//COPY ANSWER
public class editDist {
        public static int minDistance(String word1, String word2) {
            int m = word1.length();
            int n = word2.length();

            // Create a 2D matrix to store the minimum operations
            int[][] dp = new int[m + 1][n + 1];

            // Initialize the first row and column
            for (int i = 0; i <= m; i++) {
                dp[i][0] = i;
            }
            for (int j = 0; j <= n; j++) {
                dp[0][j] = j;
            }

            // Fill in the matrix using dynamic programming
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1];
                    } else {
                        dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
                    }
                }
            }

            return dp[m][n];
        }

        public static void main(String[] args) {
            editDist editDist = new editDist();
            String word1 = "horse";
            String word2 = "ros";
            System.out.println(testing.editDist.minDistance(word1, word2));  // Output: 3
        }
    }


