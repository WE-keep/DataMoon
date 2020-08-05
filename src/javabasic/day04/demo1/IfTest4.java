package javabasic.day04.demo1;

import java.util.Scanner;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 10:46 星期三
 */
public class IfTest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数");
        int b = sc.nextInt();
        System.out.println("请输入第三个整数");
        int c = sc.nextInt();

        if(a>b & a>c) {
            //a是最大值
            System.out.println("最大值为:"+a);
        }else if(b>c) {
            //a不是最大值: 最大值在b和c中
            System.out.println("最大值为:"+b);
        }else {
            System.out.println("最大值为:"+c);
        }
    }
}
