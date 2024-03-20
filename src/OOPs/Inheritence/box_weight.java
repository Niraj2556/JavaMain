package OOPs.Inheritence;

public class box_weight extends box {
    int weight;

    public box_weight() {
        super();
        this.weight = -1;
    }

     box_weight(int weight) {
        super();
        this.weight = weight;
    }


    public static void main(String[] args) {
        box_weight user = new box_weight(4);
        System.out.println(user.weight);

        box user2 = new box();
        System.out.println(user2.h);
    }
}
