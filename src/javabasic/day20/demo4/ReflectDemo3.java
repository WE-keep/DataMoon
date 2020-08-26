package javabasic.day20.demo4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/20 14:41 星期四
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        /*
        getMethod(String name, 类<?>... parameterTypes)
            返回一个 方法对象反映的类或接口的 类对象表示的指定公共成员方法。

        getMethods()
        返回一个数组包含 方法物体反射所有的类或接口的 类对象表示的公共方法，包括那些由类或接口的超类和超接口继承的声明。
        直接获取被public修饰的


         getDeclaredMethods()
            返回一个数组包含 方法物体反射所有声明的方法的类或接口的 类对象，代表包括公众、保护，默认（包）的访问，和私有方法，但不包括继承的方法。
         getDeclaringClass()
            如果该类或接口的 类对象代表的是另一个类的一个成员，返回表示它的类被宣布 类对象。

         */

        Class<?> clzz = Class.forName("javabasic.day20.demo4.Person");
        // 获取所有被public修饰的方法,除了本类的还有被继承过来的方法
        Method[] methods = clzz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("----------------------");

        // 只包含本身的方法，不包含被继承的
        Method[] dm = clzz.getDeclaredMethods();
        for (Method method : dm) {
            System.out.println(method);
        }
        System.out.println("-----------------------");

        // 获取单个被public修饰的
        Method show = clzz.getMethod("show");
        System.out.println(show);

        // 方法调对象，使用反射调用创建一个对象
        show.invoke(clzz.newInstance());
        // hello


        System.out.println("---------------");
        // 反射调用方法，并进行传参操作
        Method setSex = clzz.getMethod("setSex", String.class);
        setSex.invoke(clzz.newInstance(),"女");


        System.out.println("---------------------");

        // 根据方法名获取方法
        Method method = clzz.getDeclaredMethod("setAge", int.class);
        method.setAccessible(true);
        method.invoke(clzz.newInstance(),34);


    }
}
