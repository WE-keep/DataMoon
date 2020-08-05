package javabasic.day03.demo4;

import java.util.Scanner;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 10:34 05
 */
public class ScannerDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //2

        System.out.println("请输入您的年龄");
        int age = sc.nextInt();
        System.out.println("请输入您的名字");
        String name = sc.next();

        System.out.println("您好,"+name+",听说您今年"+age+"岁,好年轻啊,很高兴认识你");

    }
}
