package javabasic.day05.demo2;

import java.util.Scanner;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 11:28 星期三
 */
public class CircleLoginDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入密码");
        int password = sc.nextInt();
        while(password != 1234) {
            System.out.println("请输入密码");
            password = sc.nextInt();
        }
        System.out.println("登录成功");
    }
}
