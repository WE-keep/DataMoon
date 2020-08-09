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
        //[104, 101, 108, 108, 111, 32, 119, 111, 114, 108, 100]

        char[] chars = s.toCharArray();
        System.out.println(Arrays.toString(chars));
        //[h, e, l, l, o,  , w, o, r, l, d]

        boolean b = false;
        String b1 = String.valueOf(b);
        System.out.println(b1);
        //false

        System.out.println(s.toUpperCase());
        //HELLO WORLD
        String test = "he".concat("qqeq");
        System.out.println(test);
        //heqqeq
    }
}
