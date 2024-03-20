package Recursion;

public class subset_char {
    public static void main(String[] args) {

        subset(" " , "abc");
    }
    static void subset(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char first_element = up.charAt(0);

        subset( p+ first_element, up.substring(1) );
        subset(p  ,up.substring(1));
    }
}
