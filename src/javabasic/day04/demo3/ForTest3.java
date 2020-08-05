package javabasic.day04.demo3;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 11:07 星期三
 */
public class ForTest3 {
    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for(int i=1;i<=1000;i++) {
            if(i%3 == 2) {
                count1++;
            }
            if(i%5 == 3) {
                // 注意不要使用else if, 有可能会漏掉一些数
                count2++;
            }
            if(i%7==2) {
                count3++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
    }
}
