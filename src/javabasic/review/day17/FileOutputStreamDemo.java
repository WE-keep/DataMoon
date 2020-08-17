package javabasic.review.day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/14 20:05 星期五
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;

        File file;
        try {
            fos = new FileOutputStream("E:/a.txt");
            fos.write(97);
            fos.write(98);
            fos.write(99);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                fos.close();
            }
        }
    }
}
