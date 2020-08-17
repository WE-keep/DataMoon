package javabasic.day17.demo1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/16 10:38 星期日
 */
public class Demo2 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("src/javabasic/day17/demo1/data.txt");
             FileInputStream fis = new FileInputStream("src/javabasic/day17/demo1/data.txt");)
        {
            byte[] bytes = new byte[1024];
            int len = 0;

            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
