package javabasic.day11.demo4;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/7 16:58 星期五
 */
public class Demo5 {
    public static void main(String[] args) {
        //字符串首字母转大写，其他的转小写
        String a = "hUGUANYU";
        String s1 = a.substring(1);
        String s2 = a.substring(0,1);

        String s3 = s2.toUpperCase() + s1.toLowerCase();
        System.out.println(s3);
    }
}
