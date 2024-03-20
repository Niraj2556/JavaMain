package String;

public class lastWordLength {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int len = s.length() - 1;
        int counter = 0;

        while(len >= 0 && s.charAt(len) != ' '){
            counter ++;
            len--;
        }
        return counter;
    }
}
