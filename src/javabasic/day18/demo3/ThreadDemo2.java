package javabasic.day18.demo3;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/17 15:19 星期一
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        Object o = new Object();
        Tickets t1 = new Tickets(o);
        Tickets t2 = new Tickets(o);
        Tickets t3 = new Tickets(o);
        
        t1.setName("A ");
        t2.setName("B ");
        t3.setName("C ");

        t1.start();
        t2.start();
        t3.start();

    }
}

class Tickets extends Thread {
    static int tickets = 100;
    private Object o;

    public Tickets(Object o) {
        this.o = o;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (o) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(80);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() +"正在售出"+  (tickets--) + "张票");
                } else {
                    break;
                }
            }
        }

    }
}