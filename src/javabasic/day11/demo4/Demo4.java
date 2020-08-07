package javabasic.day11.demo4;

import java.util.Arrays;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/7 16:42 星期五
 */
public class Demo4 {
    public static void main(String[] args) {
        String s = "hello world";
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));

        char[] chars = s.toCharArray();
        System.out.println(Arrays.toString(chars));

        boolean b = false;
        String b1 = String.valueOf(b);
        System.out.println(b1);

        System.out.println(s.toUpperCase());
        String test = "he".concat("qqeq");
        System.out.println(test);
    }
}
