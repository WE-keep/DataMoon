package javabasic.review.socketdemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/22 19:28 星期六
 */
public class TcpClientDemo1 {
    public static void main(String[] args) throws IOException {
        // 先创建客户端对象
        Socket socket = new Socket("192.168.1.125", 10001);

        // 获取客户端Socket自带的输出流
        OutputStream os = socket.getOutputStream();

        // 写数据
        os.write("天王丐帝浒".getBytes());

        // 接收服务端回的信息
        InputStream is = socket.getInputStream();

        byte[] bytes = new byte[1024];
        int len = is.read(bytes);

        System.out.println(new String(bytes,0,len));
        is.close();
        os.close();
        socket.close();


    }
}
