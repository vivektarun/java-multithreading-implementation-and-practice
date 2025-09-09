package implementation.threadUsingThreadClass;

public class ThreadClient {
    public static void main(String[] args) {
        System.out.println("Going inside main thread: " + Thread.currentThread().getName());

        MultiThreadLearning multiThreadLearning = new MultiThreadLearning();
        multiThreadLearning.start();

        System.out.println("Finish main thread: " + Thread.currentThread().getName());
    }
}
