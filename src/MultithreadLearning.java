public class MultithreadLearning implements Runnable{
    @Override
    public void run() {
        System.out.println("code excuted by thread: " + Thread.currentThread().getName());
    }
}
