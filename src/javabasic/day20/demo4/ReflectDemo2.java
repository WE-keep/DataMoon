package javabasic.day20.demo4;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/20 11:41 星期四
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz = Class.forName("javabasic.day20.demo4.Person");

        // 获取公共的构造方法
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("---------------------------");

        // 获取所有的构造方法，包括私有的
        Constructor<?>[] constructors1 = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors1) {
            System.out.println(constructor);
        }

        System.out.println("-------------------");

        // 调用公共无参
        Constructor<?> constructor = clazz.getConstructor();
        System.out.println(constructor);

        Object o = constructor.newInstance();
        // 判断是不是Person类型
        System.out.println(o instanceof Person);

        System.out.println("-----------------------");

        // 获取有指定参数类型的构造方法
        Constructor<?> constructor1 = clazz.getConstructor(String.class, int.class, String.class);
        System.out.println(constructor1);

        Object o1 = constructor1.newInstance("zhangsan", 88, "man");
        Person p = (Person)o1;

        System.out.println(o1);
        System.out.println(p);

        System.out.println("----------------------------");

        Constructor<?> d2 = clazz.getDeclaredConstructor(String.class);
        Object o3 = d2.newInstance("caocao");
        System.out.println(o3);

    }
}
