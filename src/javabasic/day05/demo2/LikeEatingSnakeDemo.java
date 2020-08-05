package javabasic.day05.demo2;

import java.util.Scanner;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 11:27 星期三
 */
public class LikeEatingSnakeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎来到[多易贪吃蛇],请做好准备");

        System.out.println("请输入您的操作(1/0)");
        int result = sc.nextInt();
        int score = 0;
        while(result == 1) {
            score += 10;
            System.out.println("请输入您的操作(1/0)");
            result = sc.nextInt();
        }
        System.out.println("Game over,您的得分为:"+score);
    }
}
