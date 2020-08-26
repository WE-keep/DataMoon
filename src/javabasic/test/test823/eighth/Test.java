package javabasic.test.test823.eighth;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/23 15:46 星期日
 */
public class Test {
    public static void main(String[] args) {
        File file = new File("src/javabasic/test/test823/eighth/do.txt");

        OutputStream os = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                write("sdfgsd".getBytes());
            }
        };
    }
}
