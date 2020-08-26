package javabasic.test.test823.eighth;

import java.io.OutputStream;
import java.io.Serializable;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/23 16:13 星期日
 */
public class FileStream implements Serializable {
    private String name;
    private OutputStream outputStream;

    public FileStream() {
    }

    public FileStream(String name, OutputStream outputStream) {
        this.name = name;
        this.outputStream = outputStream;
    }
}
