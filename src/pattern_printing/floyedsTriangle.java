package pattern_printing;

public class floyedsTriangle {
    public static void main(String[] args) {
        printit(5);
    }
    public static void printit(int n){
        int num = 1;
        for (int i = 1 ;i<=n ; i++){
            for(int j = 1; j<=i ; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
