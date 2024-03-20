package Math;

public class divide {
    public static int divide(int dividend, int divisor) {

        boolean check = false;
        int ans = dividend  / 3;

        if(divisor < 0) {
            check = true;
        }

        return check ? - + ans : ans;
    }
}
