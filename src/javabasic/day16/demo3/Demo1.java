package javabasic.day16.demo3;

import com.sun.prism.shader.FillCircle_LinearGradient_PAD_Loader;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/14 16:08 星期五
 */
public class Demo1 {
    public static void main(String[] args) {
        File file = new File("C:/Users/DataMoon/Pictures/");
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File f = new File(dir, name);
                if (f.isFile() && name.toLowerCase().endsWith("jpg")) {
                    return true;
                }
                return false;
            }
        });

        for (File ff : files) {
            System.out.println(ff);
        }
    }
}
