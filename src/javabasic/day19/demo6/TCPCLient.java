package javabasic.day19.demo6;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/19 17:51 星期三
 */
public class TCPCLient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9999);
        OutputStream outputStream = socket.getOutputStream();

        Scanner scanner = new Scanner(System.in);
        System.out.println("START");
        while (true) {
            String next = scanner.next();
        }
    }
}
