package Recursion;
import java.util.*;


public class subequence {
    // Java code to print all possible
// subsequences for given array using
// recursion

        // Recursive function to print all
// possible subsequences for given array
        public static void subsequenceAll(int[] arr, int index, ArrayList<Integer> path)
        {

            // Print the subsequence when reach the leaf of recursion tree
            if (index == arr.length)
            {
                // Condition to avoid printing empty subsequence
                if (path.size() > 0)
                    System.out.println(path);
            }
            else
            {
                // Subsequence without including the element at current index
                subsequenceAll(arr, index + 1, path);
                path.add(arr[index]);
                // Subsequence including the element at current index
                subsequenceAll(arr, index + 1, path);
                // Backtrack to remove the recently inserted element
                path.remove(path.size() - 1);
            }
            return;
        }

        // Driver code
        public static void main(String[] args)
        {
            int[] arr = { 1, 2, 3 };

            // Auxiliary space to store each path
            ArrayList<Integer> path = new ArrayList<>();

            subsequenceAll(arr, 0, path);
        }
    }

