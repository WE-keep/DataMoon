package javabasic.day16.demo1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/14 19:48 星期五
 */
public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:/A");
//        boolean mkdirs = file.mkdirs();
//        System.out.println(mkdirs);
        File file1 = new File("E:/A/b.txt");
//        boolean newFile = file1.createNewFile();
//        System.out.println(newFile);

        System.out.println(file.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());
        System.out.println(file.isHidden());

        System.out.println("----------------------");
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.length());

        System.out.println(file1.lastModified());

        Date date = new Date(file1.lastModified());
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        System.out.println(format);

    }
}
