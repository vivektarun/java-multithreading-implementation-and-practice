package questions.usingImplement.helloWorld;

public class HelloTask implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 7; i++) {
            System.out.println("Hello - " + Thread.currentThread().getName());
        }
    }
}
