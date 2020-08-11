package javabasic.day13.demo2;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/10 10:35 星期一
 */
public class Demo1 {
    public static void main(String[] args) {
        /*
        正则表达式的本质就是字符串
        是一种规则，一种过滤器，负责对特定场景的字符串实施校验
         */
        String qq = "12345";
        System.out.println(checkQq1(qq));
        System.out.println(checkQq2(qq));
    }

    public static boolean checkQq1(String qq) {
        if (qq.length() < 5 || qq.length() > 15) {
            return false;
        }
        if (qq.startsWith("0")) {
            return false;
        }

        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkQq2(String qq) {
        return qq.matches("[1-9]\\d{4,14}");
    }

}
