package javabasic.test.test823.sixth;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/23 10:36 星期日
 */
public class TestPerson {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Person person = new Person("Eason", 46, "HongKong", 4000000.0);
        FileOutputStream fos = new FileOutputStream("src/javabasic/test/test823/sixth/person.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(person);
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("src/javabasic/test/test823/sixth/person.txt");
        ObjectInputStream ooi = new ObjectInputStream(fis);

        Object o = ooi.readObject();
        Constructor<?> constructor = o.getClass().getDeclaredConstructor(String.class, int.class, String.class, double.class);
        Object o1 = constructor.newInstance("JackCheung", 60, "HongKong", 500000.0);

        System.out.println(o1.toString());
        ooi.close();
        fis.close();

    }
}
