package javabasic.review.thread;

import javabasic.test.shoppingmachine.Machine;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/22 13:34 星期六
 */
public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread();
//        myThread.start();
//        myThread.join();
//        System.out.println(MyThread.num);

        // 随机的，无序的
        /*MyThread2 caocao = new MyThread2("caocao");
        MyThread2 liubei = new MyThread2("liubei");
        caocao.start();
        liubei.start();
        for (int i = 0; i < 30; i++) {
            System.out.println("主线程" + i);
        }*/

        /*MyThread3 guanyu = new MyThread3();
        guanyu.setName("关羽");
        guanyu.start();
        guanyu.interrupt();
        // 使用interrupt 会报异常，但是不会中断语句执行*/


/*        MyThread4 thread4 = new MyThread4();
        thread4.start();*/

        /*// 在用户进程结束之后，程序会直接关闭，不再理会守护进程
        MyThread5 mt5 = new MyThread5();
        MyThread6 th6 = new MyThread6("皇后");
        MyThread6 th7 = new MyThread6("贵妃");
        // 设置为守护进程
        th6.setDaemon(true);
        th7.setDaemon(true);
        mt5.start();
        Thread.sleep(3000);
        th6.start();
        th7.start();*/



    }
}

class MyThread5 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("King" + i);
        }
    }
}

class MyThread6 extends Thread {
    private String name;
    public MyThread6(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(name + i);
        }
    }
}

class MyThread4 extends Thread {
    @Override
    public void run() {
        long l = System.currentTimeMillis();
        int num = 0;
        for (int i = 0; i < 500000; i++) {
            num += i;
            Thread.yield();
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);
    }
}

class MyThread3 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 30; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}

class MyThread extends Thread {
    public static int num = 0;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            num += i;
        }
        System.out.println(num);
    }
}

class MyThread2 extends Thread {
   private String name;
   public MyThread2(String name) {
       this.name = name;
   }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(this.name + " " + i);
        }
    }
}
