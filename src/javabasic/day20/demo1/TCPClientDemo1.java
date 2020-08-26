package javabasic.day20.demo1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/20 9:20 星期四
 */
public class TCPClientDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        客户端从键盘每录入一条信息,就发送给服务端,服务端就打印内容(缓冲字符流(转换流))
         */
        Socket socket = new Socket("localhost", 9999);
        OutputStream outputStream = socket.getOutputStream();

        Scanner scanner = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

        System.out.println("Please Input");
        while (true) {
            String s = scanner.next();
            bufferedWriter.write(s);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            if (s.equals("886")) {
                break;
            }
        }
        bufferedWriter.close();
        socket.close();
    }
}
