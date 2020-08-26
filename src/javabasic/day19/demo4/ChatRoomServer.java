package javabasic.day19.demo4;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ChatRoomServer implements Runnable {
    @Override
    public void run() {
        DatagramSocket ds = null;
        try {
            //创建服务端对象
            ds = new DatagramSocket(9999);

            //接受数据  循环接受   也要结束
            while (true) {
                DatagramPacket dp = new DatagramPacket(new byte[64 * 1024], 64 * 1024);

                ds.receive(dp);

                byte[] data = dp.getData();

                int len = dp.getLength();

                InetAddress address = dp.getAddress();

                String s = new String(data, 0, len);

                System.out.println(address + ":" + s);

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
