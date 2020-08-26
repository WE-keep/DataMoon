package javabasic.day20.demo4;

import java.util.Hashtable;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/20 10:59 星期四
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
        1.通过 类名.class
        2.通过 对象名.getClass()
        3.通过class类中的 forName()

        类加载器
        - java类库
        - 第三方类库
        - 自己写的
         */
        Class<Person> ac = Person.class;
        System.out.println(ac);

        Class<? extends Person> bc = new Person().getClass();
        System.out.println(bc);

        Class<?> cc = Class.forName("javabasic.day20.demo4.Person");
        System.out.println(cc);

        //Error:java: 错误: 目标 1.8 不允许选项 --add-exports
        // 错误原因，在使用过程中用JDK11写代码，用JDK8进行编译

        System.out.println(bc.getClassLoader());
        System.out.println(ReflectDemo1.class.getClassLoader());
        //Error:java: 错误: 目标 1.8 不允许选项 --add-exports




    }
}
