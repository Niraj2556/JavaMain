package Arrays;

public class findMinimumValue {
  //Returns minimum value from given Array
        public static int findMinimum(int[] arr) {

            int minimum = arr[0];

            int len = arr.length;
            //At every Index compare its value with minimum and if its less then make that index value new minimum value
            for (int i = 1; i < len; i++) {

                if (arr[i] < minimum) {
                    minimum = arr[i];
                }
            }
            return minimum;
        } //end of findMinimum

        public static void main(String[] args) {

            int[] arr = { 9, 2, 3, 6};

            System.out.print("Array : ");
            for(int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
            System.out.println();

            int min = findMinimum(arr);
            System.out.println("Minimum in the Array: " + min);

        }

    }


