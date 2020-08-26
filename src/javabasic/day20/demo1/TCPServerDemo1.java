package javabasic.day20.demo1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/20 9:20 星期四
 */
public class TCPServerDemo1 {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(9999);
        Socket accept = socket.accept();

        InputStream inputStream = accept.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        String line = null;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            if (line.equals("886")) {
                break;
            }
        }
        bufferedReader.close();
        accept.close();
        socket.close();
    }
}
