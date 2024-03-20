package function;

import java.util.Arrays;

public class var_args {
    public static void main(String[] args) {
       func(55,43,43,533445);
    }
    static void func(int...v){
        System.out.println(Arrays.toString(v));
    }
}
