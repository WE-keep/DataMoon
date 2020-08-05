package javabasic.day04.demo2;

import java.util.Scanner;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 10:53 星期三
 */
public class SwitchTest {
    public static void main(String[] args) {
        System.out.println(6|7|8);
        System.out.println(12|1|2);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = sc.nextInt();
        switch(month) {
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("您输入的月份不合法");
        }
    }

}
