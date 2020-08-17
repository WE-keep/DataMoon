package javabasic.day16.demo1;

import java.io.File;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/14 19:58 星期五
 */
public class FileDemo5 {
    public static void main(String[] args) {
        File file = new File("E:/");
        String[] list = file.list();

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("==============");

        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getAbsolutePath() + "\t" + file1.length() + "\t" + file.lastModified());
        }
    }
}
