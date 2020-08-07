package javabasic.day11.demo3;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/7 15:48 星期五
 */
public class Demo3 {
    public static void main(String[] args) {
        String s = "hello world";
        System.out.println(s.contains("hello"));
        System.out.println(s.contains(s));
        System.out.println(s.startsWith("h"));
        System.out.println(s.endsWith("d"));

        String s2 ="";
        String s3 = " ";
        System.out.println(s2.isEmpty());
        System.out.println(s3.isEmpty());

        String s4 = null;
        System.out.println(s4.isEmpty());
        // java.lang.NullPointerException
    }
}
