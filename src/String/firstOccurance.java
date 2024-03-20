package String;

public class firstOccurance {

    public static int strStr(String haystack, String needle) {
        int len = haystack.length();
        int k = needle.length();

        if(len < k) return -1;

        for( int i = 0; i <= len - k ;i++){
            int j = 0;
            while (j < k && haystack.charAt(i + j) == needle.charAt(j)){
                j++;

                if(j == k) return i;
            }

        }
        return  -1;
    }


    public static void main(String[] args) {
        String haystack = "hello", needle = "kk";

        System.out.println(strStr(haystack , needle));

    }
}
