package javabasic.day17.demo2;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/16 15:23 星期日
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("src/javabasic/day17/demo2/Demo1.java");
        FileWriter writer = new FileWriter("src/javabasic/day17/demo2/test.txt");

        char[] chars = new char[1024];
        int len;
        while ((len = reader.read(chars)) != -1) {
            writer.write(chars,0,len);
            writer.flush();
        }
        reader.close();
        writer.close();
    }
}
