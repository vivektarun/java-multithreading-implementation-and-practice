package questions.usingExtend.helloWorld;

public class HelloWorldClient {
    public static void main(String[] args) {
        HelloTaskExtend helloTaskExtend = new HelloTaskExtend();
        WorldTaskExtend worldTaskExtend = new WorldTaskExtend();

        helloTaskExtend.start();
        worldTaskExtend.start();
    }
}
