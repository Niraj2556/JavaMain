package String;

public class CountUppercase {
    static int countCamelCase (String s)
    {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
                if (ch <= 90 && ch >= 65){
                    count++;

            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "ckjkUUYI";

        System.out.println(countCamelCase(s));
    }
}
