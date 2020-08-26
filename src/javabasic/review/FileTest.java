package javabasic.review;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/21 17:08 星期五
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
/*        File file = new File("src/javabasic/review/复习");
        System.out.println(file.exists());

        File file1 = new File("src/javabasic/review","test");

        if (!file1.exists()) {
            file1.createNewFile();
        }
        System.out.println(file1.exists());

        File file2 = new File("src/javabasic/review");
        System.out.println(file2.exists());

        File file3 = new File(file2, "test2.md");
        if (!file3.exists()) {
            file3.createNewFile();
        }
        file3.delete();
        file1.delete();*/

        // 创建单层文件夹，路径 src/javabasic/review已经创建好了
        File file = new File("src/javabasic/review/test");
/*        if (!file.mkdir()) {
            file.mkdir();
        }
        boolean mkdir = file.mkdir();
        System.out.println(mkdir);*/
        // 创建多层目录
        File file1 = new File("src/javabasic/review/test2");
//        file.mkdirs();

        // 需要注意书写的时候使用的路径，不然容易出错
//        file1.renameTo(new File("src/javabasic/review/test2"));
        File file2 = new File("src/javabasic/review/FileTest.java");
//        System.out.println(file1.isDirectory());
//        System.out.println(file2.isFile());
//
//        System.out.println(file1.exists());
//        System.out.println(file2.isHidden());
//        System.out.println(file2.canWrite());
//        System.out.println(file2.canExecute());
//        System.out.println(file2.canRead());

//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getPath());
//        System.out.println(file.getName());
//        System.out.println(file.length());
//        System.out.println(file2.lastModified());

//        long l = file2.lastModified();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        Date date = new Date(l);
//        String format = simpleDateFormat.format(date);
//        System.out.println(format);

//        String Path = file.getAbsolutePath();
//        System.out.println(Path);

        File file3 = new File("D:/bigdata");
//        System.out.println(file3.exists());

        // 获取所有的子文件名称
//        String[] list = file3.list();
//        for (String s : list) {
//            System.out.println(s);
//        }

        // 获取所有的子文件对象
        // 并且输出所有文件的名称

//        System.out.println(file3);
        // D:\bigdata
//        listAllFile(new File("D:\\bigdata"));
//        new File("src/javabasic/review/test").createNewFile();
        File file4 = new File("src/javabasic/review");
//        System.out.println(findFile(file4, "md"));
        File file5 = new File("E:\\极客时间\\091 Vim 实用技巧必知必会");

        delAll(file5);



    }
    // 递归删除一个文件夹或者文件
    public static void delAll(File file) {
        // 如果是文件,直接删除
        if (file.isFile()) {
            file.delete();
        } else {
            // 如果是文件夹
            File[] files = file.listFiles();
            if (files != null && files.length > 0) {
                for (File file1 : files) {
                    delAll(file1);
                }
            }
            // 要讲将自己删除，不然会留下空文件夹
            file.delete();
        }

    }

    // 打印出一个目录下的所有文件，包括目录名
    public static void listAllFile(File file) {
        if (!file.isDirectory()) {
            System.out.println("  " + file.getName());
        } else {
            System.out.println(file.getName());
            File[] files = file.listFiles();
            for (File file1 : files) {
                listAllFile(file1);
            }
        }
    }

    public static void findFiles(String path, String suffix) {
        File file = new File(path);
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {

                return false;
            }
        });

    }


}
