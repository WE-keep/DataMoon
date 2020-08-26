package javabasic.review.day20;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/20 17:42 星期四
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {

        // 三种方法获取类
        Class<?> clazz1 = Class.forName("javabasic.review.day20.Person");
//        Class<Person> clazz2 = Person.class;
//        Class<? extends Person> clazz3 = new Person().getClass();
//        System.out.println(clazz1);
//        System.out.println(clazz2);
//        System.out.println(clazz3);

        // 创建实例
        Object o = clazz1.newInstance();
        Person p = (Person) o;
        System.out.println(p);

        // 使用反射调用方法

        // 获取构造方法
       /* Constructor<?>[] constructors = clazz1.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }*/

       // 获取无参的构造
//        Constructor<?> constructor = clazz1.getDeclaredConstructor();
//        System.out.println(constructor);

        // 获取类这中所有公共类
//        Method[] methods = clazz1.getMethods();
//        for (Method method : methods) {
//            System.out.println(method);
//        }

/*        Method sayHello = clazz1.getDeclaredMethod("sayHello");
        sayHello.setAccessible(true);
        sayHello.invoke(clazz1.newInstance());*/

 /*       Method[] methods = clazz1.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method);
        }*/

        // 获取类中的所有参数
        /*Field[] fields = clazz1.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field);
        }*/

        Field age = clazz1.getDeclaredField("age");
        Object o1 = clazz1.newInstance();

        age.set(o1,23);
        Person person = (Person)o1;
        System.out.println(person.age);


    }
}
