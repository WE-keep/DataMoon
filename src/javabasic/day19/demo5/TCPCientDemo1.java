package javabasic.day19.demo5;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/19 17:22 星期三
 */
public class TCPCientDemo1 {
    public static void main(String[] args) throws IOException {
        // 创建客户端对象
        Socket socket = new Socket("127.0.0.1", 10001);
        // 获取客户端Socket自带的输入流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello world".getBytes());
        outputStream.close();
        socket.close();
    }
}
