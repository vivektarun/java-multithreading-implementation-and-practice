package implementation.threadUsingThreadClass;

public class MultiThreadLearning extends Thread{
    @Override
    public void run() {
        System.out.println("Code executed by thread: " + Thread.currentThread().getName());
    }
}
