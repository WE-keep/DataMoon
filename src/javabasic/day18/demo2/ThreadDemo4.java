package javabasic.day18.demo2;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/17 11:50 星期一
 */
public class ThreadDemo4 {
    public static void main(String[] args) {
        new MyThread4().start();
    }
}

class MyThread4 extends Thread {

    @Override
    public void run() {
        long l = System.currentTimeMillis();
        int num = 0;

        for (int i = 0; i < 500000; i++) {
            num += 1;
            Thread.yield();
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);
    }
}
