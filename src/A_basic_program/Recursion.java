public class Recursion {
    public static void main(String[] args) {
        message(1);

    }
    static void message( int n){
        System.out.println("Hello I am calling " + n);
        message(1 + n);
    }

//    static void message2(){
//        System.out.println("Hello I am message2");
//        message3();
//    }
//    static void message3(){
//        System.out.println("Hello I am message3");
//        message4();
//    }
//    static void message4(){
//        System.out.println("Hello I am message4");
//        message5();
//    }
//    static void message5(){
//        System.out.println("Hello I am message5");
//    }
}
