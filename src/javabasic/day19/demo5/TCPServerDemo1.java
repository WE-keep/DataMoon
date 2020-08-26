package javabasic.day19.demo5;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/19 17:23 星期三
 */
public class TCPServerDemo1 {
    public static void main(String[] args) throws IOException {
        // 负责监听
        ServerSocket socket = new ServerSocket(10001);
        // 阻塞方法 如果一直没有客户端过来连接，就一直处于监听状态
        Socket accept = socket.accept();

        InputStream inputStream = accept.getInputStream();

        byte[] bytes = new byte[1024];
        int i = inputStream.read(bytes);

        String s = new String(bytes, 0, i);
        System.out.println(s);

        inputStream.close();
        accept.close();
        accept.close();
    }
}
