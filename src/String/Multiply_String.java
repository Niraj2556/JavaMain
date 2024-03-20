package String;

public class Multiply_String {
    public static String multiply(String num1, String num2) {


        String ret = "";
        int ans= 0;
        int first = 0;
        int second = 0;
        int digit = 0;
        int digit1 = 0;
        for (int i=0; i < num1.length(); i++) {
            char c = num1.charAt(i);

            digit = Character.getNumericValue(c);
        }
        first = first * 10 + digit;

        for (int i=0; i < num2.length(); i++) {
            char d = num2.charAt(i);

            digit1 = Character.getNumericValue(d);
        }

        second = second * 10 + digit1;


        ans = first * second;

        ret = Integer.toString(ans);

        return ret;
    }


    public static void main(String[] args) {

        String a= "2";
        String b= "5";

        System.out.println(multiply(a,b));
    }
}
