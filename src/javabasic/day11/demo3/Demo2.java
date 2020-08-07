package javabasic.day11.demo3;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/7 15:43 星期五
 */
public class Demo2 {
    public static void main(String[] args) {
        String s = "nihao";
        String s2 = new String("nihao");
        System.out.println(s == s2);
        System.out.println(s.equals(s2));
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
    }
}
