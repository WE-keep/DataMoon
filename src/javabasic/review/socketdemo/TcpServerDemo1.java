package javabasic.review.socketdemo;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/22 19:34 星期六
 */
public class TcpServerDemo1 {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(10001);
        // 监听是否有客户端要来连接 如果有就返回客户端是Socket对象
        // 阻塞方法，如果阻塞，就一直处于监听状态
        Socket accept = socket.accept();

        InputStream is = accept.getInputStream();

        byte[] bytes = new byte[1024];
        int len = is.read(bytes);

        String s = new String(bytes, 0, len);
        System.out.println(s);

        // 给客户端回数据
        OutputStream os = accept.getOutputStream();
        os.write("小鸡炖蘑菇".getBytes());

        os.close();
        is.close();
        accept.close();
        socket.close();
    }
}
