package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class inputFromUser {
    static void arr(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();

        System.out.println("Enter the number");
        int[] nums = new int[n];

        for (int i =0 ; i< n ; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        arr();
    }
}
