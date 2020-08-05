package javabasic.day10.demo4;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 16:15 星期三
 */
public class Demo2 {
    public static void main(String[] args) {
        new Outer2().func();
    }
}

class Outer2 {
    private int num = 1;
    private int num1 = 10;

    public void func() {
        class Inner {
            private int num = 2;
        }
        Inner inner = new Inner();
        System.out.println(inner.num);
    }
}