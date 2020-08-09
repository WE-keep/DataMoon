package javabasic.day11.demo5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/7 17:45 星期五
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入测试文字");
        String line = scanner.nextLine();
        String[] split = line.split(" ");
        System.out.println(Arrays.toString(split));

    }
}
