package javabasic.day19.demo2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/19 15:02 星期三
 */
public class UDPClient {
    public static void main(String[] args) throws Exception {
        // 创建udp客户端Socket对象
        DatagramSocket datagramSocket = new DatagramSocket();

        String s = "Hello World";
        InetAddress localHost = InetAddress.getLocalHost();
        //将数据进行打包操作
        DatagramPacket packet = new DatagramPacket(s.getBytes(),s.getBytes().length,localHost,8888);
        // 发送数据
        datagramSocket.send(packet);
        // 关闭
        datagramSocket.close();
    }
}
