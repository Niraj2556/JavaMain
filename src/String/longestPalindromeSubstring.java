package String;

public class longestPalindromeSubstring {
    public static String longestPalindrome(String s) {
    int n = s.length();
        if (n < 2) {
        return s;
    }

    int start = 0;
    int maxLength = 1;

        for (int i = 0; i < n; i++) {
        // Check for odd-length palindromes
        int len1 = expandAroundCenter(s, i, i);

        // Check for even-length palindromes
        int len2 = expandAroundCenter(s, i, i + 1);

        // Find the maximum length between odd and even palindromes
        int currentLength = Math.max(len1, len2);

        // If the current palindrome is longer than the previously found one, update it
        if (currentLength > maxLength) {
            maxLength = currentLength;

            // Calculate the new starting index based on the current center
            start = i - (currentLength - 1) / 2;
        }
    }

    // Extract the longest palindrome substring
        return s.substring(start, start + maxLength);
}

    // Helper function to expand around a center and find the length of a palindrome
    public static int expandAroundCenter(String s, int left, int right) {
        int n = s.length();
        while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the length of the palindrome found
        return right - left - 1;

    }
    public static void main(String[] args) {
        String s = "babad";
        String result = longestPalindrome(s);
        System.out.println(result); // Output: "bab" or "aba"
    }
}
