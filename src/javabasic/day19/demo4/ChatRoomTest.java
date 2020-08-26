package javabasic.day19.demo4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatRoomTest {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(5);


        es.execute(new ChatRoomServer());

        Thread.sleep(3000);

        es.execute(new ChatRoomClient());
    }
}
