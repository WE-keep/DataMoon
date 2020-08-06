package javabasic.test.test1;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/6 11:31 星期四
 */
public class Test5 {
    public static void main(String[] args) {
        A a = new A();
        //20
        System.out.println(a.myMethod(10));

        B b = new B();
        System.out.println(b.myMethod(10));
        //70
    }
}
class A {
    public int myMethod(int num) {
        return num + 10;
    }
}

class B extends A {
    @Override
    public int myMethod(int num) {
        return super.myMethod(num) + 50;
    }
}