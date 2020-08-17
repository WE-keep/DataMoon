package javabasic.day16.demo3;

import java.io.File;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/14 16:29 星期五
 */
public class Demo2 {
    public static void main(String[] args) {
        getJavaFile(new File("D:/bigdata"),".java");
    }

    public static void getJavaFile(File f, String s) {
        if (f.isFile()) {
            if (f.getName().toLowerCase().endsWith(s)) {
                System.out.println(f);
            }
        } else {
            File[] files = f.listFiles();

            if (files != null && files.length > 0) {
                for (File file : files) {
                    getJavaFile(file,s);
                }
            }
        }
    }
}
