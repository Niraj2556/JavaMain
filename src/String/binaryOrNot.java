package String;

public class binaryOrNot {
    static boolean isBinary(String str)
    {
        int i = 0;
        while(i < str.length()){
            char ch = str.charAt(i);
            if(ch != '1' && ch != '0'){
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "0111100110101100";

        System.out.println(isBinary(str));
    }
}
