package javabasic.day03.demo3;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5
 */
public class ThreeEyesOperatorDemo {
    public static void main(String[] args) {
        int a = 15;
        int b = 23;

        int c = a > b ? a : b;
        System.out.println(c);

        String d = a < b ? "a" : "b";
        System.out.println(d);
    }
}
