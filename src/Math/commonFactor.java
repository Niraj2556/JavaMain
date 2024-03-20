package Math;

public class commonFactor {
    public static int commonFactors(int a, int b) {
        int count = 0;
        for(int i=1 ; i< a ; i++){
            if(a % i == 0 && b % i == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a = 885 ;
        int b = 885;

        System.out.println(commonFactors(a,b));
    }
}
