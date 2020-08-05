package javabasic.day05.demo2;

import java.util.Scanner;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 11:34 星期三
 */
public class DoYouLoveMeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;
        do {
            System.out.println("你爱我么?");
            answer = sc.nextLine();
        }while(!"爱".equals(answer));
        System.out.println("爱我就别伤害我!");
    }
}
