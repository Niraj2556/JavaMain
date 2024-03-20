package testing;

public class rec {
    public static void main(String[] args) {
        int[] hello = {1,2,3,4,5,55,31,76,77};
        int target = 5675;
        System.out.println(check(hello,target,0));
    }
    static int check(int[] hello , int target,int idx){
        if (idx== hello.length){
            return -1;
        }
//        (target == hello[idx] || check(hello,target,idx+1));
        return idx;
    }
}
