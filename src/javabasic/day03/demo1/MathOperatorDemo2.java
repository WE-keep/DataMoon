package javabasic.day03.demo1;

/**
 * @author DataMoon
 */
public class MathOperatorDemo2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        ++a;
        b++;
        System.out.println(a);
        System.out.println(b);

        int c = 10;
        int d = 10;

        int e = ++c;
        int f = d++;
        System.out.println(e);
        System.out.println(f);

        int g = 10;
        int h = 10;
        System.out.println(++g);
        System.out.println(h++);
    }
}
