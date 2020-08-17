package javabasic.day16.demo4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/14 17:50 星期五
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fls = new FileInputStream("E:\\test.txt");

        int read = fls.read();
        System.out.println(read);


    }
}
