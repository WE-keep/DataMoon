package javabasic.day19.demo4;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatRoomClient implements Runnable {
    @Override
    public void run() {
        DatagramSocket ds = null;
        try {
            //创建一个客户端的udp对象
            ds = new DatagramSocket();

            //发送数据   循环发送
            //需要一个键盘录入循环发送
            Scanner sc = new Scanner(System.in);
            System.out.println("开始进入聊天模式");

            InetAddress address = InetAddress.getByName("192.168.1.255");

            DatagramPacket dp = null;

            while (true) {
                String s = sc.next();

                dp = new DatagramPacket(s.getBytes(), s.getBytes().length, address, 9999);

                ds.send(dp);

                if (s.equals("886")) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭socket
            if (ds != null) {
                ds.close();
            }
            ds = null;
        }


    }
}
