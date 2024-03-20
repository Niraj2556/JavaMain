package OOPs.Static_game;

public class Static_using{
        static int a = 1;
        static int b;


        static{
            System.out.println("I am Static");

            b = a * 4;
        }

        public static void main(String[] args) {
            Static_using obj = new Static_using();
            System.out.println( Static_using.a + " " +Static_using.b);


            Static_using.b = 3;

            Static_using obj1 = new Static_using();
            System.out.println(obj.a + " "+ obj.b);


        }
    }

