package questions.usingImplement.helloWorld;

public class HelloWorldClient {
    public static void main(String[] args) {
        Thread t1 = new Thread(new HelloTask());
        Thread t2 = new Thread(new WorldTask());

        t1.start(); // -> this is thread-0
        t2.start(); // -> this is thread-1
    }
}
