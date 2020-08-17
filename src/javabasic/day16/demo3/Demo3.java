package javabasic.day16.demo3;

import java.io.File;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/14 16:51 星期五
 */
public class Demo3 {
    public static void main(String[] args) {

    }

    public static void deleteFile(File file) {
        if (file.isFile()) {
            file.delete();
        } else {
            File[] files = file.listFiles();
            if (files != null && files.length > 0) {
                for (File file1 : files) {
                    deleteFile(file1);
                }
            }
            file.delete();
        }
    }
}
