package javabasic.day11.demo3;

import javax.crypto.spec.PSource;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/7 15:11 星期五
 */
public class Demo1 {
    public static void main(String[] args) {
        String s = new String();
        System.out.println(s);
        s = null;
        System.out.println(s);

        byte[] by = {97,98,99,100};
        String str = new String(by);
        System.out.println(str);
        String str2 = new String(by,1,3);
        System.out.println(str2);
    }
}
