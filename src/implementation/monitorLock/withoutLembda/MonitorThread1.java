package implementation.monitorLock.withoutLembda;

import implementation.monitorLock.MonitorLockExample;

public class MonitorThread1 implements Runnable{
    MonitorLockExample obj;

    public MonitorThread1(MonitorLockExample ojb) {
        this.obj = obj;
    }

    @Override
    public void run() {
        obj.task1();
    }
}
