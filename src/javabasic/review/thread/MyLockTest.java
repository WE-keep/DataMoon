package javabasic.review.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/22 14:39 星期六
 */
public class MyLockTest {
    public static void main(String[] args) {
        MyLock m1 = new MyLock();
        new Thread(m1,"同一把锁").start();
        new Thread(m1,"同心锁").start();
        new Thread(m1,"锁").start();
    }
}

class MyLock implements Runnable {
    int tickets = 100;
    private Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (tickets > 0) {
                    Thread.sleep(80);
                    System.out.println(Thread.currentThread().getName() + "正在售卖第" + (tickets--) + "张票");
                } else {
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
