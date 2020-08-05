package javabasic.day04.demo3;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 11:05 星期三
 */
public class ForTest1 {
    public static void main(String[] args) {
        //1-10
        for(int i=1;i<=10;i++) {
            System.out.println(i);
        }
        //10-1
        for(int i=10;i>0;i--) {
            System.out.println(i);
        }
        for(int i=1;i<=10;i++) {
            System.out.println(11-i);
        }
        System.out.println("------");
        //3,打印1-100中所有的偶数
        for(int i=1;i<=50;i++) {
            //方法1
            System.out.println(i*2);
        }
        for(int i=1;i<=100;i++) {
            //方法2
            if(i%2 == 0) {
                System.out.println(i);
            }
        }
        for(int i=2;i<=100;i+=2) {
            //方法3
            System.out.println(i);
        }
        //4.1-10 之和
        int sum = 0;
        //sum 带表1-10 之和
        for(int i=1;i<=10;i++) {
            sum  += i;
            //  sum = sum +i;	把1-10 都加到sum身上
        }
        System.out.println(sum);
        //55,在循环外打印,循环结束后才计算完毕
        //求  1-100  奇数和    偶数和

    }
}
