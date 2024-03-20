package Arrays;

public class duplicates {

    public static int removeDuplicates(int arr[], int len)
    {
        // Return, if array is empty or
        // contains a single element
        if (len == 0 || len == 1)
            return len;

        int[] temp = new int[len];

        // Start traversing elements
        int j = 0;
        for (int i = 0; i < len - 1; i++)

            // If current element is not equal to next
            // element then store that current element
            if (arr[i] != arr[i + 1])
                temp[j++] = arr[i];

        // Store the last element as whether it is unique or
        // repeated, it hasn't stored previously
        temp[j++] = arr[len - 1];

        // Modify original array
        for (int i = 0; i < j; i++)
            arr[i] = temp[i];

        return j;
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        int len = arr.length;

        // removeDuplicates() returns new size of array
        len = removeDuplicates(arr, len);

        // Print updated array
        for (int i = 0; i < len; i++)
            System.out.print(arr[i] + " ");
    }
}
