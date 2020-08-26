package javabasic.day18.demo3;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/17 16:39 星期一
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        MyRunable th1 = new MyRunable();
        new Thread(th1).start();
        new Thread(th1).start();
        new Thread(th1).start();
    }
}

class MyRunnable implements Runnable {
    static int tickets = 100;
    private ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while(true) {
            lock.lock();
            try {
                if(tickets>0) {
                        Thread.sleep(30);
                        System.out.println(Thread.currentThread().getName()+"===正在出售第"+ tickets-- +"张票");
                }else {
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
