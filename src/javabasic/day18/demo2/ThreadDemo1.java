package javabasic.day18.demo2;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/17 10:34 星期一
 */
public class ThreadDemo1{
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("曹操");
        myThread1.start();

        MyThread myThread2 = new MyThread("刘备");
        myThread2.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程" + i);
        }
    }
}

class MyThread extends Thread {
    private  String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.name+ ":" + i);
        }
    }
}