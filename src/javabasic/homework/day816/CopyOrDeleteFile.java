package javabasic.homework.day816;
import java.io.*;
/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/16 19:38 星期日
 */
public class CopyOrDeleteFile {
    /**
     * 复制文件
     * @param srcFile  要复制的文件
     * @param destFilefile   新文件的名称
     */
    public static void copyFile(File srcFile, File destFilefile) {
        //复制的文件不止文本文件，所以采用字节流复制
        //缓冲字节流，字节数组复制
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(srcFile));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destFilefile))
        ) {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bufferedInputStream.read(bytes)) > 0) {
                bufferedOutputStream.write(bytes, 0, len);
                bufferedOutputStream.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //分析：
    //  A:封装数据源scrFile
    //  B:封装目的地destFile
    //  C:判断scrfile是文件夹还是文件
    //      a：是文件夹
    //          就在目的地下创建文件夹
    //          获取该File对象下所有文件或者文件夹File对象
    //          遍历得到每一个File对象
    //          回到C
    //      b：是文件
    //          复制（字节流）

    /**
     * 复制指定文件空间到目标文件空间
     * @param srcFile   指定的文件空间
     * @param destFile  目标文件空间
     */
    public static void copyFolder(File srcFile, File destFile) {
        if (srcFile.isDirectory()) {
            //不是文件
            //  就在目的地下创建文件夹
            File newFolder = new File(destFile, srcFile.getName());
            newFolder.mkdir();
            //获取该File对象下所有文件或者文件夹File对象
            File[] fileArray = srcFile.listFiles();
            for (File file : fileArray) {
                copyFolder(file, newFolder);
            }
        } else {
            //是文件
            //复制
            File newfile = new File(destFile, srcFile.getName());
            copyFile(srcFile, newfile);
            //调用复制文件的方法
        }
    }

    //递归删除多级文件夹或文件

    /**
     * 删除文件空间
     * @param file  指定要删除的文件空间
     */
    public static void deleteFolder(File file) {
        if (file.isFile()) {
            file.delete();
        } else {
            File[] files = file.listFiles();
            for (File f : files) {
                if (f.isFile()) {
                    //如果是文件就直接删除
                    f.delete();
                } else {
                    //如果是文件夹就递归调用
                    deleteFolder(f);
                }
            }
            //删除空目录
            file.delete();
        }
    }
}
