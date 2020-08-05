package javabasic.day10.demo5;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 16:20 星期三
 */
public class StaticInnerDemo1 {

    public static void main(String[] args) {
        StaticOuter.StaticInner.show();

    }
}

/**
 * 静态内部类：在成员类的头加个static
 */
class StaticOuter {
    static String name = "chen";

    static class StaticInner {
        public static void show() {
            System.out.println(name);
        }
    }

    public void get() {
        System.out.println("hello");
    }
}