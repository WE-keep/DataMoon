package javabasic.day18.demo3;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/17 14:49 星期一
 */
public class ThreadTest {
    public static void main(String[] args) {
        ThreadTest2 th1 = new ThreadTest2();
        th1.setName("T1 ");
        ThreadTest2 th2 = new ThreadTest2();
        th2.setName("T2 ");

        th1.start();
        th2.start();
    }
}

class ThreadTest2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
