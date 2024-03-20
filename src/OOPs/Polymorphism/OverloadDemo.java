package OOPs.Polymorphism;

public class OverloadDemo {

    void test(double a){
        System.out.println("Inside test(double) a: " + a);
    }
}

class overload{
    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();
        byte i = 20;
        obj.test(i);
        obj.test(20.4);

    }
}