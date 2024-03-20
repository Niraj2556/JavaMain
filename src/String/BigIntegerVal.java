package String;

import java.math.BigInteger;

public class BigIntegerVal {
    public static String multiply(String num1, String num2) {

        BigInteger n1= new BigInteger(num1);
        BigInteger n2= new BigInteger(num2);

        BigInteger ans = n1.multiply(n2);

        String val = " " + ans;
        return val;
//        return ""+n1.multiply(n2);
//        BigInteger n1 = new BigInteger(num1);
//        BigInteger n2 = new BigInteger(num2);
//        BigInteger result = n1.multiply(n2);
//        String ret = String.valueOf(result);
//        return ret;
    }

    public static void main(String[] args) {
        System.out.println(multiply("6913259244" , "71103343"));
    }
}
