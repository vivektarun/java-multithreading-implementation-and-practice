package questions.usingExtend.helloWorld;

public class HelloTaskExtend extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 7; i++) {
            System.out.println("Hello - " + Thread.currentThread().getName());
        }
    }
}
