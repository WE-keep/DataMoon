package javabasic.day04.demo1;

import java.util.Scanner;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 10:51 星期三
 */
public class IfTest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入红包金额");
        int amount = sc.nextInt();
        if(amount == 1314) {
            System.out.println("明天我就嫁给你");
        }else if(amount == 521) {
            System.out.println("么么哒");
        }else if(amount > 10) {
            System.out.println("你是个好人");
        }else {
            System.out.println("呵呵");
        }
    }
}
