package javabasic.review.day12;

import com.sun.prism.shader.Solid_RadialGradient_REFLECT_AlphaTest_Loader;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/20 19:50 星期四
 */
public class PackagClassDemo {
    public static void main(String[] args) {
        // 装箱操作
        Integer a = 1;

        // 拆箱操作
        a += 1;
        System.out.println(a);

        int b = 10;
        Integer b2 = Integer.valueOf(b);

        String s = "12";
        Integer s1 = Integer.valueOf(s);
        System.out.println(s1);

        int i = s1.intValue();
    }
}
