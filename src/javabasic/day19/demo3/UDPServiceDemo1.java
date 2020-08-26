package javabasic.day19.demo3;


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/19 16:11 星期三
 */
public class UDPServiceDemo1 {
    public static void main(String[] args) throws Exception {
        // 创建服务器对象
        DatagramSocket datagramSocket = new DatagramSocket(8888);
        // 接收数据 循环接收 也要结束
        byte[] bytes = new byte[64 * 1024];
        while (true) {
            DatagramPacket packet = new DatagramPacket(bytes,bytes.length);
            datagramSocket.receive(packet);

            byte[] data = packet.getData();
            int length = packet.getLength();
            InetAddress address = packet.getAddress();

            String s = new String(data, 0, length);

            System.out.println(address + "  " + s);

            if (s.equals("886")) {
                break;
            }
        }
        // 关闭服务器
        datagramSocket.close();
    }
}
