package OOPs.Inheritence;

public class box {
    private double l;
    protected double h;
    public double w;
//    double weight;

    static void greeting() {
        System.out.println("Hey, I am in Box class. Greetings!");
    }

    public double getL() {
        return l;
    }

    box () {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // cube
    box(double side) {
        // super(); Object class
        this.w = side;
        this.l = side;
        this.h = side;
    }


    box(double l, double h, double w) {
        System.out.println("Box class constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }

    box(box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
}
