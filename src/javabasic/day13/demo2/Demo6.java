package javabasic.day13.demo2;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/10 14:54 星期一
 */
public class Demo6 {
    public static void main(String[] args) {
        //将手机号中间的4位给替换
        String phone = "15797860618";
        String s = phone.replaceAll("(\\d{3})(\\d{4})(\\d{4})", "$1****$3");
        System.out.println(s);
    }
}
