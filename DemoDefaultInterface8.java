@FunctionalInterface
public interface DemoDefaultInterface8 {

    void abc();
    default void show(){
        System.out.println("I am method definition in Interface");
    }
}
