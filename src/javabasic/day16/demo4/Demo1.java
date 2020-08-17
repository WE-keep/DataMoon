package javabasic.day16.demo4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/14 17:12 星期五
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\test.txt", true);
         fos.write(97);

         byte[] bytes = {97,98,99,100,101,102};
         fos.write(bytes);

         String s = "天下第一";
         fos.write(s.getBytes());
         fos.write(s.getBytes(),6,6);
         //换行

         fos.write("\r\n".getBytes());
         fos.write(s.getBytes(),6,6);
    }
}
