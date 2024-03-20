package String;

public class breakPalindrome {
    public static String break1Palindrome(String palindrome) {
    if (palindrome.length() == 1) return "";
        for (int i = 0; i < palindrome.length() / 2; ++ i) {
        if (palindrome.charAt(i) != 'a') {
            /* If the character is not 'a' then replace it with 'a' and return the string */
            return palindrome.substring(0, i) + 'a' + palindrome.substring(i + 1);
        }
    }

        /* If all the characters are 'a' replace the last character with 'b' */
        return palindrome.substring(0, palindrome.length() - 1) + 'b';
}


    public static String break2Palindrome(String palindrome) {
        int len = palindrome.length();
        char strArr[] = palindrome.toCharArray();
        for(int i=0;i<len/2;i++){
            if(strArr[i] != 'a'){
                strArr[i] = 'a';
                return String.valueOf(strArr);
            }
        }
        strArr[len-1] = 'b';
        return len<=1?"":String.valueOf(strArr);
    }

    public static String break3Palindrome(String palindrome) {
        int n = palindrome.length();
        if(n == 1){
            return "";
        }

        /* Two pointer left and right */
        int left = 0, right = n-1;

        while(left < right){
            if(palindrome.charAt(left) == 'a'){
                left++; right--;
            }else{
                /* If the character is not 'a' then replace it with 'a' and return the string */
                return palindrome.substring(0, left) + 'a' + palindrome.substring(left + 1);
            }
        }

        /* If all the characters are 'a' replace the last character with 'b' */
        return palindrome.substring(0, n-1) + 'b';
    }
    public static void main(String[] args) {
        String ans = "abccba";
//        System.out.println(breakPalindrome(ans));

        System.out.println(break2Palindrome(ans));
    }
}
