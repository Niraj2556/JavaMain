package OOPs.Interface;

public interface music {
    void start();
    default void stop(){
        System.out.println("Stop in MUSIC");
    };
    default void hello(){
        System.out.println("Neera j");
    };
}
