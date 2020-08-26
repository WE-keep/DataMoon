package javabasic.day19.demo3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/19 16:04 星期三
 */
public class UDPClientDemo1 {
    public static void main(String[] args) throws Exception {
        // 创建一个客户端的UDP对象
        DatagramSocket ds = new DatagramSocket();
        InetAddress localHost = InetAddress.getLocalHost();
        // 发送数据 循环发送
        // 需要键盘录入，循环发送
        Scanner sc = new Scanner(System.in);
        System.out.println("开始进入聊天模式");
        while (true) {
            String s = sc.nextLine();

            DatagramPacket packet = new DatagramPacket(s.getBytes(),s.getBytes().length,localHost,8888);
            ds.send(packet);

            if (s.equals("886")) {
                break;
            }
        }
        // 关闭Socket，
        ds.close();
    }
}
