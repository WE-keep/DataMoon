package javabasic.day05.demo3;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 11:39 星期三
 */
public class CircleDemo {
    public static void main(String[] args) {
		/*for(int i=1;i<=4;i++) {// 外层循环:  控制行
			for(int j=1;j<=5;j++) {//内层循环:  控制列
				System.out.print("*");// 内层循环,不换行
			}
			System.out.println();// 内层循环结束后换行
		}*/
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
