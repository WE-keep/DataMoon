package javabasic.review.day18;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/17 21:40 星期一
 */
public class ExecutorDemo {
    public static void main(String[] args) {
        /*ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }*/

       /* ExecutorService pool = Executors.newFixedThreadPool(20);
        for (int i = 0; i < 20; i++) {
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "A");
                }
            });
        }*/

        /*ExecutorService poo2 = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            poo2.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }*/



    }
}