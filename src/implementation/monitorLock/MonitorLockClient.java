package implementation.monitorLock;

import implementation.monitorLock.withoutLembda.MonitorThread1;

public class MonitorLockClient {
    public static void main(String[] args) {
        MonitorLockExample obj = new MonitorLockExample();

        //Without lembda
        MonitorThread1 runnableObj = new MonitorThread1(obj);
        Thread t1 = new Thread(runnableObj);

        //With using lembda.
        Thread t2 = new Thread(() -> {obj.task2();});
        Thread t3 = new Thread(() -> {obj.task3();});

        t1.start();
        t2.start();
        t3.start();
    }
}
