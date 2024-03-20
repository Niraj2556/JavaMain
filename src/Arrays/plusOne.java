package Arrays;

import java.util.Arrays;

public class plusOne {
    public static int[] plusOne(int[] digits) {

        int n = digits.length - 1;
        if(digits[n]== 9){
            digits[n+1] = 0;
            digits[n-1] += 1; //It goes Arrays Index Out of Bound  take the 2nd solution  PLUSON()
        }
        else{
            digits[n] += 1;
        }
        return digits;
    }
    public static int[] plusOn(int[] digits) {
        int n = digits.length;
        for (int i = n-1; i >= 0 ; i--)
        {
            if(digits[i] <9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newArr = new int[n+1];
        newArr[0] =1;
        return newArr;
    }


    public static void main(String[] args) {
        int[] num = {1,3,4,5,9,9,9};

        plusOn(num);

        System.out.println(Arrays.toString(num));

    }
}
