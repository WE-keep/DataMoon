package javabasic.day04.demo1;

import java.util.Scanner;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 10:44 星期三
 */
public class IfDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数");
        int b = sc.nextInt();

        if(a!= b) {
            System.out.println("不相等");
        }else {
            System.out.println("相等");
        }
    }
}
