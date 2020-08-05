package javabasic.day05.demo2;

import java.util.Scanner;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 11:28 星期三
 */
public class CircleLoginDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;//局部变量不赋初值不能使用
        do {
            System.out.println("请输入密码");
            password = sc.nextLine();
            // 赋值的操作
        }while(!"abc1234".equals(password));
        System.out.println("登录成功");
    }
}
