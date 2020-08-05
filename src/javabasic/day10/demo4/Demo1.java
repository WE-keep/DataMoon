package javabasic.day10.demo4;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 16:02 星期三
 */


public class Demo1 {
    /**
     * 局部内部类
     * 没有修饰符
     */
    public static void main(String[] args) {
        new Outer().show();
    }
}
class Outer {
    int a = 30;

    public void show() {
        int b =  20;
        class Inner {
            public void get() {
                System.out.println(b);
            }
        }
        Inner inner = new Inner();
        inner.get();
    }
}
