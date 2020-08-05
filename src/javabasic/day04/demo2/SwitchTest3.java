package javabasic.day04.demo2;

import java.util.Scanner;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 11:04 星期三
 */
public class SwitchTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个分数");
        int score = sc.nextInt();
        if(score>100 | score <0) {
            System.out.println("分数不合法");
            return;//结束这个方法
        }
        switch(score/10) {
            // 109
            case 10:
                System.out.println("A");
                break;
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("E");
                break;
        }
    }
}
