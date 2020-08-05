package javabasic.day04.demo1;

import java.util.Scanner;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 10:45 星期三
 */
public class IfTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = sc.nextInt();
        if(month >=3 && month<=5) {
            System.out.println("春季");
        }else if(month>=6 && month<=8) {
            System.out.println("夏季");
        }else if(month>=9 && month <=11) {
            System.out.println("秋季");
        }else if(month==12 | month==1 | month == 2) {
            System.out.println("冬季");
        }else {
            System.out.println("月份不合法");
        }
    }
}
