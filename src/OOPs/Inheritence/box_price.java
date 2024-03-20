package OOPs.Inheritence;

public class box_price extends box_weight{
    int price;
    box_price(){
        super();
        this.price = -1;
    }

    box_price(int price){
        super();
        this.price = price;
    }

    public static void main(String[] args) {
        box_price user3 = new box_price(444);
        System.out.println(user3.price);
    }
}
