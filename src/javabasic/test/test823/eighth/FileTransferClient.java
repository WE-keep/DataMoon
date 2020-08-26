package javabasic.test.test823.eighth;

import java.io.*;
import java.lang.reflect.Constructor;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/23 13:37 星期日
 */
public class FileTransferClient {
    public static void main(String[] args) throws IOException, NoSuchMethodException {
        File file = new File("src/javabasic/test/test823/eighth/do.txt");

        String name = file.getName();
        Socket socket = new Socket();
        OutputStream os = socket.getOutputStream();

        FileStream fs = new FileStream(name, os);

    }
}
