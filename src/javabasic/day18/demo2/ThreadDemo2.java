package javabasic.day18.demo2;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/17 11:31 星期一
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        new MyThread2().start();
        new MyThread2().start();
        new MyThread2().start();
        new MyThread2().start();
    }
}
class MyThread2 extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
