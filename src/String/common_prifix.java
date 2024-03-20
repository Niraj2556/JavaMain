package String;

import java.util.Arrays;

public class common_prifix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        Arrays.sort(strs);
        String first_element = strs[0];
        String last_element = strs[strs.length - 1];
        int ans = 0;
        while(ans < first_element.length())
        {
            if (first_element.charAt(ans) == last_element.charAt(ans)) {
                ans++;
            }else {
                break;
            }
        }
        return ans == 0 ? "" : first_element.substring(0, ans);
    }

    public static void main(String[] args) {
        String[] helo = {"flower","flow","flight", "hkjh"};
        System.out.println(longestCommonPrefix(helo));
    }
}

