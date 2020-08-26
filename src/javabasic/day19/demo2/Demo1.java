package javabasic.day19.demo2;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/19 14:54 星期三
 */
public class Demo1 {
    public static void main(String[] args) throws UnknownHostException {
        // 可以获取局域网可以查询的所有
        InetAddress name = InetAddress.getByName("DESKTOP-3KO63FH");
        System.out.println(name);   //DESKTOP-3KO63FH/192.168.137.121

        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);  // DESKTOP-3KO63FH/192.168.137.121

        String hostName = name.getHostName();
        String hostAddress = name.getHostAddress();
        System.out.println(hostName);   // DESKTOP-3KO63FH
        System.out.println(hostAddress);    // 192.168.137.121

        InetAddress loopbackAddress = InetAddress.getLoopbackAddress();
        System.out.println(loopbackAddress);    // localhost/127.0.0.1




    }
}
