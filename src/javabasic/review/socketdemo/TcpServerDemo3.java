package javabasic.review.socketdemo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/22 19:56 星期六
 */
public class TcpServerDemo3 {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8888);
        Socket accept = socket.accept();

        InputStream is = accept.getInputStream();

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = is.read(bytes)) != -1) {
            String s = new String(bytes, 0, len);
            System.out.println(s);
        }

        is.close();
        socket.close();

    }
}
