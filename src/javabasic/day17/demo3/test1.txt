package javabasic.day17.demo3;

import java.io.*;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/16 15:55 星期日
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/javabasic/day17/demo3/Demo1.java"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/javabasic/day17/demo3/test1.txt"));

        String str = null;
        while ((str = reader.readLine()) != null) {
            writer.write(str);
            writer.newLine();
            writer.flush();
        }

    }
}
