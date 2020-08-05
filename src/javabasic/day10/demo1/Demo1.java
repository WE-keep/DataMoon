package javabasic.day10.demo1;

import java.util.Scanner;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 14:24 星期三
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new Demo1().show();
        new Demo1().justDo();
    }
    /*
    protected 同一个包任意访问，其他包需要继承之后new子类才能访问
     */

    protected void show() {
        System.out.println("GoGoHO");
    }
    /*
    default 只能在同一个包里面访问
     */

    void justDo() {
        System.out.println("you can go");
    }
}
