package javabasic.review.socketdemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.SocketHandler;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/22 19:56 星期六
 */
public class TcpClientDemo3 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8888);

        OutputStream os = socket.getOutputStream();
        os.write("天下之大，唯我独尊".getBytes());
        socket.shutdownOutput();

        InputStream is = socket.getInputStream();

        byte[] bytes = new byte[1024];

        int len = 0;
        while ((len = is.read(bytes)) != -1) {
            String s = new String(bytes, 0, len);
            System.out.println(s);
        }

        os.close();
        socket.close();
    }
}
