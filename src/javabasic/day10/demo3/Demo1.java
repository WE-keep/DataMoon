package javabasic.day10.demo3;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 15:47 星期三
 */
public class Demo1 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show();

        Outer.Inner inner1 = new Outer().new Inner();
        inner.show();
    }
}

class A {
    String name = "chen";
}

class B {
    int age = 500;
}

class Outer extends A{
    class Inner  extends B{
        public void show() {
            System.out.println(name + age);
        }
    }
}