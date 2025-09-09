package questions.usingExtend.helloWorld;

public class WorldTaskExtend extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 7; i++) {
            System.out.println("World - " + Thread.currentThread().getName());
        }
    }
}
