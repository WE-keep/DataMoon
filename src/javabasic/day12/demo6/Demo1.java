package javabasic.day12.demo6;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/8 17:10 星期六
 */
public class Demo1 {
    public static void main(String[] args) {
        /*
        abs(int a);
        ceil(double a);
        floor(double a);
        pow(double a, double b)
        random()
        round(double a)
        sqrt(double a)
         */

        System.out.println(Math.abs(-12));
        System.out.println(Math.ceil(-12.2));
        System.out.println(Math.floor(-12.2));
        System.out.println(Math.pow(2,4));
        System.out.println((int)(Math.random() * 100 + 1));
        System.out.println(Math.round(23.5));
        System.out.println(Math.sqrt(9));
    }
}
