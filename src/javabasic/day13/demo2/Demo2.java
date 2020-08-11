package javabasic.day13.demo2;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/10 11:21 星期一
 */
public class Demo2 {
    public static void main(String[] args) {
        String s = "s";
        boolean b = s.matches("\\.");
        System.out.println(b);

        String ss = "012345";
        boolean b2 = ss.matches("\\d{5,15}");
        System.out.println(b2);

        String s2 = " ";
        System.out.println(s2.matches("\\s"));

        String s3 = "12.3";
        System.out.println(s3.matches("\\d+ (\\.\\d+)?"));
    }
}
