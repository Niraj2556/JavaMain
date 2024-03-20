package LinkedListQUES;
////202
public class HappyNumber {

    public class Node{
        private Node next;
        private int value;


        public Node(int value) {
            this.value = value;
        }
    }


    public boolean isHappy(int n){
        int slow = n;
        int fast = n;

        do {
            slow =findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while (slow != fast);{
            if (slow == 1){
                return true;
            }
            return false;
        }


    }
    public int findSquare(int num){
        int ans= 0;
        while (num > 0){
            int remainder = num % 10;
            ans += remainder * remainder;
            num /= 10;
        }
        return ans;
    }


    public static void main(String[] args) {

    }
}
