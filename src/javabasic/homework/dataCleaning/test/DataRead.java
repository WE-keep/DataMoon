package javabasic.homework.dataCleaning.test;

import java.io.*;
import java.util.Arrays;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/18 17:40 星期二
 */
public class DataRead {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/javabasic/homework/dataCleaning/data1/raw_data.txt");
        char[] chars =new char[1024];
        int len;
        while ((len = fileReader.read(chars)) != -1) {
            System.out.println(new String(chars));
        }
        fileReader.close();
    }
}
