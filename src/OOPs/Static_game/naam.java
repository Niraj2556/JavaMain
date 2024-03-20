package OOPs.Static_game;

class innerClass {

    static String name;
    innerClass(String new_name) {
        innerClass.name = new_name;
    }
}
    public class naam{
        public static void main(String[] args) {
            innerClass name2 = new innerClass("Google");

            innerClass name1 = new innerClass("Alexa");


            System.out.println(name1.name);

            System.out.println(name2.name);
        }
    }

