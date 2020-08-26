package javabasic.review;

import java.io.*;
import java.util.ArrayList;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/21 22:22 星期五
 */
public class ObjectOutputStreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\bigdata\\src\\javabasic\\review\\test"));
        Object o = ois.readObject();

        Person person = (Person) o;
        System.out.println(person.toString());

        ArrayList<String> strings = new ArrayList<>();
//        System.arraycopy();
    }
}

