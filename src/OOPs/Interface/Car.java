package OOPs.Interface;

public class Car implements engine , brake, music{
    @Override
    public void brake() {

        System.out.println("Hello I AM break");
    }

    @Override
    public void stop() {
        System.out.println("Hello I AM stop");

    }

    @Override
    public void start() {
        System.out.println("Hello I AM start");

    }

    @Override
    public void acc() {
        System.out.println("Hello I AM acc");

    }

    @Override
    public void hello(){
        System.out.println("Hello I AM hello");

    }
}
