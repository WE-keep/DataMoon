package javabasic.day04.demo4;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 11:09 星期三
 */
public class WhileTest {
    public static void main(String[] args) {
        int i = 1;
        while(i<=10) {
            System.out.println(i);
            i++;
        }

        i=10;
        while(i>0) {
            System.out.println(i);
            i--;
        }

        int sum = 0;//1-10之和
        int j=1;
        while(j<=10) {
            sum += j;
            j++;
        }
        System.out.println(sum);//55

        int singleSum = 0;
        int doubleSum = 0;
        j=1;
        while(j<=100) {
            if(j%2 == 0) {
                doubleSum += j;
            }else {
                singleSum += j;
            }
            j++;
        }
        System.out.println(singleSum);
        System.out.println(doubleSum);
    }
}
