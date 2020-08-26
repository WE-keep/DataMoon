package javabasic.day20.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/20 15:47 星期四
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // 泛型的作用期只在编译期有用
        // 反射直接跳过编译器

        ArrayList<String> list = new ArrayList<>();
        list.add("hello");

        Class<? extends ArrayList> clazz = list.getClass();



        // 获取add方法
        Method m = clazz.getDeclaredMethod("add", Object.class);
        m.invoke(list, 20);

        System.out.println(list.toString());
    }
}
