package pattern_printing;
//Print this
//        A
//        BC
//        DEF
//        GHIJ
public class pattern6 {
    public static void main(String[] args) {
        int number  = 4;
        print(number);
    }
    static void print(int n){
        char ch = 'A';

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();

        }
    }
}
