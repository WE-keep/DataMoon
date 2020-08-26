package javabasic.review.socketdemo;


import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/22 19:43 星期六
 */
public class TcpServerDemo2 {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(9999);

        Socket accept = socket.accept();

        InputStream is = accept.getInputStream();

        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = is.read(bytes)) != -1) {
            String str = new String(bytes, 0, len);
            System.out.println(str);
            if (str.equals("886")) {
                break;
            }
        }
        is.close();
        accept.close();
        socket.accept();

    }
}
