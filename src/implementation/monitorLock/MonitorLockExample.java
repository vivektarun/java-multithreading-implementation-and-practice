package implementation.monitorLock;

public class MonitorLockExample {
    public synchronized void task1() {
        //do something
        try {
            System.out.println("inside task1");
            Thread.sleep(1000);
        } catch(Exception e) {
            //handle the exception.
        }
    }

    public void task2() {
        System.out.println("inside task 2 but before synchronized");
        synchronized (this) {
            System.out.println("inside synchronized task2");
        }
    }

    public void task3() {
        System.out.println("task3");
    }
}
