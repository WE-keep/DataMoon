package javabasic.day04.demo2;

import java.util.Scanner;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 11:04 星期三
 */
public class SwitchTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int a = sc.nextInt();
        System.out.println("请输入一个符号(+-*/)");
        String b = sc.next();
        System.out.println("请输入第三个数");
        int c = sc.nextInt();

        switch(b) {
            case "+":
                System.out.println(a+b+c+"="+(a+c));
                break;
            case "-":
                System.out.println(a+b+c+"="+(a-c));
                break;
            case "*":
                System.out.println(a+b+c+"="+(a*c));
                break;
            case "/":
                System.out.println(a+b+c+"="+(a/c));
                break;
            default:
                System.out.println("不会算!");
        }
    }
}
