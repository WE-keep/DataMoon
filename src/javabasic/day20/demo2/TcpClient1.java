package javabasic.day20.demo2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/20 9:35 星期四
 */
public class TcpClient1 {
    public static void main(String[] args) throws IOException {
        /*
        客户端从键盘每录入一条信息,就发送给服务端,服务端就打印内容,并把内容转成大写,再写回给客户端,客户端打印
         */
        Socket socket = new Socket("localhost", 22222);

    }
}
