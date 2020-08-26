package javabasic.myclient;

import javabasic.myclient.pojo.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Properties;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/22 20:28 星期六
 */
public class MyClient {
    private static String username;
    private static String password;
    private static String command;
    private static String className;

    static {
        try {
            Properties properties = new Properties();
            properties.load(MyClient.class.getClassLoader().getResourceAsStream("config.properties"));

            username = properties.getProperty("username");
            password = properties.getProperty("password");
            command = properties.getProperty("command");
            className = properties.getProperty("className");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        User user = new User(username, password, command, className);
        Socket socket = new Socket("192.168.137.1", 8888);

        OutputStream os = socket.getOutputStream();

        ObjectOutputStream oos = new ObjectOutputStream(os);

        oos.writeObject(user);

        oos.close();
        socket.close();
    }

}
