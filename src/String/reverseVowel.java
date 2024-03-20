package String;

public class reverseVowel {
    public static String reverseVowels(String s) {
        char[] ans = s.toCharArray();
        int i = 0;
        int j = ans.length - 1;

        while(i < j) {
            if(isVowel(ans[i])) {
                while(i < j && !isVowel(ans[j])) {
                    j--;
                }
                if(isVowel(ans[j])) {
                    swap(ans, i, j);
                    j--;
                }
            }
            i++;
        }

        return new String(ans);
    }

    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    static void swap(char[] arr, int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void main(String[] args) {
//        Input: s = "hello"
//        Output: "holle"
//
//        Input: s = "leetcode"
//        Output: "leetcode"

        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }
}
