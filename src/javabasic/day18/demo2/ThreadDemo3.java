package javabasic.day18.demo2;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/17 11:40 星期一
 */
public class ThreadDemo3 {
    public static void main(String[] args) throws InterruptedException {
        MyThread3 myThread3 = new MyThread3();

        myThread3.start();

        myThread3.join();
        System.out.println(MyThread3.num);
    }
}

class MyThread3 extends Thread {
    public static int num = 0;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            num += i;
        }
    }
}
