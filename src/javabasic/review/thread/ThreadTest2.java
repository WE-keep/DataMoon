package javabasic.review.thread;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/22 14:01 星期六
 */
public class ThreadTest2 {
    public static void main(String[] args) {
/*        MyRunnable mr = new MyRunnable();
        Thread thread = new Thread(mr);
        thread.start();*/
        MyRunnableTickets mr = new MyRunnableTickets();
        Thread t1 = new Thread(mr, "飞猪");
        Thread t2 = new Thread(mr, "12306");
        Thread t3 = new Thread(mr, "携程");

        t1.start();
        t2.start();
        t3.start();
    }
}

// Runnable知识一个任务类，不能直接创建进程
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}

class MyRunnableTickets implements Runnable {
    int tickets = 100;
    @Override
    public void run() {
        while (true) {
            synchronized (ThreadTest.class) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在售卖第" + (tickets--) + "张");
                } else {
                    break;
                }
            }

        }
    }
}