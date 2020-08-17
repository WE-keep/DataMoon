package javabasic.day16.demo2;

import java.io.File;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/14 15:58 星期五
 */
public class Demo6 {
    public static void main(String[] args) {
        File file = new File("C:/Users/DataMoon/Pictures/Camera Roll");

        if (!file.exists()) {
            return;
        }

        File[] files = file.listFiles();

        for (File ff : files) {
            if (ff.isFile() && ff.getName().toLowerCase().endsWith(".jpg")) {
                System.out.println(ff);
            }
        }
    }
}
