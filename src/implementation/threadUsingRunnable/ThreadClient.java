package implementation.threadUsingRunnable;

public class ThreadClient {
    public static void main(String[] args) {
        System.out.println("Going inside the main method: " + Thread.currentThread().getName());

        //step 1: make the object.
        MultithreadLearning runnableObj = new MultithreadLearning();

        //step 2: Now make the object of the Thread class where we pass the runnableObj in ctor.
        Thread thread = new Thread(runnableObj);

        //step 3: Now we will run the thread using start() -> internally it calles the run method only.
        thread.start(); // start() -> start0() -> run();

        /*
        * Finally we are invoking run() method using thread class as we have passed runnableObj there
        * In thread class it calls the run method of the runnableObj.
        * */


        System.out.println("finish main thread:" + Thread.currentThread().getName());

    }
}