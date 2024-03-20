package testing;

public class recTest {
    public static void main(String[] args) {
        recTesting("" ,"ab");
    }
    static void recTesting(String a , String b ){
        if(b.isEmpty()){
            System.out.println(a);
            return;
        }
        char first_element = b.charAt(0);
        recTesting(a + first_element, b.substring(1));
        recTesting(a, b.substring(1));
    }
}
