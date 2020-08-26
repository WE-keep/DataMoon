package javabasic.review.socketdemo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.SocketHandler;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/22 19:43 星期六
 */
public class TcpClientDemo2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",9999);

        // 获取输出流
        OutputStream os = socket.getOutputStream();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.next();
            os.write(s.getBytes());
            if (s.equals("886")) {
                break;
            }
        }
        os.close();
        socket.close();

    }
}
