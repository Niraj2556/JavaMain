package pattern_printing;

public class pattern7 {
    public static void main(String[] args) {
        printit(5);
    }
    public static void printit(int num){
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print(j);

            }
            System.out.println();


        }

    }
}
