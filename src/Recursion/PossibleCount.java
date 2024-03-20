package Recursion;

public class PossibleCount {
    public static void main(String[] args) {
        Possible_count("", 3);
    }

    static void Possible_count(String p , int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i < 6 && i<= target; i++) {

//            System.out.println("hello");
            Possible_count(p + i , target - i);
        }
    }
}
