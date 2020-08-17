package javabasic.day16.demo1;

import java.io.File;
import java.io.IOException;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/14 19:44 星期五
 */
public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:/A");
        System.out.println(file.createNewFile());
        file.delete();

        File file1 = new File("E:/abc");
        file1.mkdir();


    }
}
