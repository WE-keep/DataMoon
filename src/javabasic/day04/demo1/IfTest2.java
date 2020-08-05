package javabasic.day04.demo1;

import java.util.Scanner;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 10:45 星期三
 */
public class IfTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入x的值");
        int x = sc.nextInt();
        if(x>=3) {
            System.out.println("y="+ (2*x +1));
        }else if(x>=-1 & x<1) {
            System.out.println("y="+ 2*x);
        }else if(x<-1) {
            System.out.println("y="+(2*x-1));
        }else {
            System.out.println("x不合法");
        }
    }
}
