package javabasic.day20.demo4;

import java.lang.reflect.Field;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/20 15:06 星期四
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        /*
        Field getDeclaredField(String name)
            返回一个对象，反映了 Field指定声明字段的类或接口的 类对象表示。包含私有的
        Field[] getDeclaredFields()
            返回 Field物体反射所有字段的类或接口的 类对象表示声明数组。

        Field getField(String name)
            返回一个 Field对象反映的类或接口的 类对象表示的指定公共成员。
        Field[] getFields()
            返回一个数组包含 Field物体反射的类或接口的 类对象代表所有可访问的公共领域。


         */
        Class<?> clazz = Class.forName("javabasic.day20.demo4.Person");

        // 一个数组，所有参数还有接口的
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("------------------------");

        // 只能获取使用public修饰的
        Field[] fields1 = clazz.getFields();
        for (Field field : fields1) {
            System.out.println(field);
        }

        System.out.println("-------------------------");

        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);

        Object o = clazz.newInstance();
        name.set(o,"caocao");

        Field age = clazz.getDeclaredField("age");
        age.set(o,20);
        Field sex = clazz.getDeclaredField("sex");
        sex.set(o,"女");

        System.out.println(o);

        System.out.println();

        System.out.println("----------------------");
        Field[] fields2 = clazz.getDeclaredFields();
        // 使用数组使用需要先对数组中的元素进行判断
        Object o1 = clazz.newInstance();
        fields2[0].setAccessible(true);
        fields2[0].set(o1,"刘备");
        fields2[1].set(o1,23);
        fields2[2].set(o1,"男");

        System.out.println(o1);

    }
}
