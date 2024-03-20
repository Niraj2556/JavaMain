package String;

public class lastZero {
    public static void removeTrailingZeros(String num) {
        for(int i = num.length()-1 ; i> 0 ; i--){
            char ch = num.charAt(i);
            if(ch == '0'){
                System.out.println(num.substring(i-1 , i));;
            }
        }

    }

    public static String removeTrailingZero(String num) {
        int len = num.length() - 1;
        for (int i = len; i > 0; i--) {
            if (num.charAt(i) != '0') {
                break;
            }
            len--;
        }
        return num.substring(0, len + 1);
    }


    public static void main(String[] args) {

        String ret = "51230100";
        System.out.println(removeTrailingZero(ret));
    }
}
