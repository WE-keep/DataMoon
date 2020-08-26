package javabasic.review.thread;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/22 14:29 星期六
 */
public class MyTicketsTest {
    public static void main(String[] args) {
        Object o = new Object();

        MyTicket mt1 = new MyTicket(o);
        MyTicket mt2 = new MyTicket(o);
        MyTicket mt3 = new MyTicket(o);

        mt1.setName("飞猪");
        mt2.setName("智行");
        mt3.setName("12306");

        mt1.start();
        mt2.start();
        mt3.start();
    }
}
class MyTicket extends Thread {
    static int tickets = 100;
    private Object o;

    public MyTicket(Object o) {
        this.o = o;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (o) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(80);
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