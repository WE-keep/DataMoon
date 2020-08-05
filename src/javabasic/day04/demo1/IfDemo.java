package javabasic.day04.demo1;

import java.util.Scanner;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 10:39 星期三
 */
public class IfDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("如果我学会了大数据你还会离开我么?(true/false)");
        boolean re = sc.nextBoolean();
        if(re) {
            System.out.println("轻轻地我走了,正如我轻轻了来,我挥一挥衣袖,和你说声拜拜");
        }else {
            System.out.println("执子之手与子偕老,一起去多易,学习大数据!!!");
        }
        System.out.println("over");
    }
}

