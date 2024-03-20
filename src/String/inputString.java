package String;

import java.util.Scanner;

public class inputString {
    static void printIntString(String S,int N){
        Scanner sc = new Scanner(System.in);
        S= sc.nextLine();
        N = sc.nextInt();

        System.out.print("The input string :" + S);
        System.out.print("The input integer :" +N);
    }

    public static void main(String[] args) {
        String ans = "GeeksforGeeks";
        int n = 0;
        printIntString(ans , n);
    }
}
