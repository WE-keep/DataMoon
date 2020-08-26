package javabasic.day19.demo2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/19 15:02 星期三
 */
public class UDPServer {
    public static void main(String[] args) throws Exception {
        //创建服务端的对象
        DatagramSocket socket = new DatagramSocket(8888);

        // UDP 发送的数据不能大于64kb
        byte[] bytes = new byte[1024 * 64];

        // 创建一个 DatagramPacket
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length);
        socket.receive(packet);

        // 获取客户端传递过来的各种信息
        InetAddress address = packet.getAddress();

        int length = packet.getLength();

        int port = packet.getPort();

        byte[] data = packet.getData();

        System.out.println(address + "---" + ":" + new String(data,0,length));


    }
}
