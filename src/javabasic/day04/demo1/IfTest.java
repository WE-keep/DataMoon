package javabasic.day04.demo1;

import java.util.Scanner;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 10:42 星期三
 */
public class IfTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数");
        int b = sc.nextInt();

        String result = "相等";
        if(a!=b) {
            result = "不相等";
        }
        System.out.println(result);
    }
}
