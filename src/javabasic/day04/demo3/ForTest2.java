package javabasic.day04.demo3;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 11:06 星期三
 */
public class ForTest2 {
    public static void main(String[] args) {
        int singleSum = 0;//奇数和
        int doubleSum = 0;//偶数和
        for(int i=1;i<=100;i++) {
            if(i%2 == 0) {//偶数
                doubleSum += i;
            }else {// 奇数
                singleSum += i;
            }
        }
        System.out.println("奇数和为:"+singleSum);
        System.out.println("偶数和为:"+doubleSum);
    }
}
