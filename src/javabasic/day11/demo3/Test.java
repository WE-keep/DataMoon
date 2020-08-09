package javabasic.day11.demo3;

import java.util.Scanner;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/7 15:55 星期五
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String passWd = "1234";
        String userName = "cht";
        int i = 0;
        boolean flag = true;
        while (flag) {
            System.out.println("请输入用户名");
            String name = sc.nextLine();
            System.out.println("请输入密码");
            String pwd = sc.nextLine();
            if (!name.equals(userName) || !passWd.equals(pwd)) {
                i++;
                System.out.println("你还有:" + (3 - i) + "次机会");
                if (i == 3) {
                    System.out.println("没机会了");
                    flag = false;
                    break;
                }
            } else {
                System.out.println("登陆成功");
                break;
            }
        }

/*        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String name = sc.nextLine();
            System.out.println("请输入密码");
            String pwd = sc.nextLine();

            if (!passWd.equals(pwd) || !userName.equals(name)) {
                System.out.println("密码或者账号输入错误");
                System.out.println("你还有" +(2-i) + "次");
            } else {
                System.out.println("登陆成功");
                break;
            }

        }*/
    }
}
