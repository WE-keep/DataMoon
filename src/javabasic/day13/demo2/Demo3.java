package javabasic.day13.demo2;

import java.util.Scanner;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/10 11:38 星期一
 */
public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入手机号码");
        String phone = scanner.next();
        boolean b = checkPhone(phone);
        System.out.println(b);
    }

    public static boolean checkPhone(String phone) {
        //匹配手机号
        return phone.matches("1[3-9]\\d{9}");
    }
}
