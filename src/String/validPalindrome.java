package String;

public class validPalindrome{

    public static boolean ques(String s){

        s = s.replaceAll(",", "");
        s = s.replaceAll(" ", "");
        s = s.replaceAll(":", "");
        s = s.replaceAll("\\.", "");
        s = s.toLowerCase();

        if (s.length() == 1)return true;
        int start = 0;
        int end = s.length()-1;
        while(start <= end){
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
    }
        return true;
    }

    public static void main(String[] args) {
//        String str = "A man, a plthgan, a canal: Panama";
        String str = "race a car";
        System.out.println(str);

        System.out.println(ques(str));
    }
}
