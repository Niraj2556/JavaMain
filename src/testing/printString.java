package testing;

public class printString {
    public static void hello(){
        String letter = "";
        while (letter.length() != 2){
            letter += "a";
            System.out.println(letter);
        }
    }

    public static void main(String[] args) {
        hello();
    }
}
