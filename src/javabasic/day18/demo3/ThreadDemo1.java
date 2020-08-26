package javabasic.day18.demo3;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/17 14:40 星期一
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        // 线程任务
        MyRunable myRunable = new MyRunable();

        //将线程任务放到线程里面
        Thread thread = new Thread(myRunable,"T1 ");
        Thread thread2 = new Thread(myRunable,"T2 ");

        thread.start();
        thread2.start();
    }
}

class MyRunable implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
