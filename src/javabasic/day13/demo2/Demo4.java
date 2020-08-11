package javabasic.day13.demo2;

import java.util.Scanner;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/10 11:57 星期一
 */
public class Demo4 {
    public static void main(String[] args) {
        //匹配邮箱
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your email.");
        String email = scanner.next();
        boolean b = checkEmail(email);
        System.out.println(b);
    }

    public static boolean checkEmail(String email) {
        return email.matches("\\w{7,17}[a-zA-Z0-9]@\\w{2,}(\\.[a-zA-Z]{2,})");
    }
}
