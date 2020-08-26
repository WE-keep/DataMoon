package javabasic.day20.demo5;

import java.io.IOException;
import java.util.Properties;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/20 17:11 星期四
 */
public class ReflectTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Properties properties = new Properties();
        properties.load(ReflectTest.class.getClassLoader().getResourceAsStream("config1.properties"));

        String property = properties.getProperty("class_name");

        Class<?> clazz = Class.forName(property);

        Object o = clazz.newInstance();
        UserInterface userInterface = (UserInterface)o;

        userInterface.login();

    }
}
