package javabasic.day04.demo2;

import java.util.Scanner;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 10:52 星期三
 */
public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数(1-7)");
        int day = sc.nextInt();
        switch(day) {
            // byte, int,short, char		jdk: String
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("没有这一个天,是不是傻");
        }
    }
}
