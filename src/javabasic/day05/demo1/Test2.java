package javabasic.day05.demo1;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 11:26 星期三
 */
public class Test2 {
    public static void main(String[] args) {
       int i = 1;
        do {
            System.out.println(i);
            i++;
        }while(i<=10);

        i = 10;
        do {
            System.out.println(i);
            i--;
        }while(i>0);

        int sum = 0;
        i = 1;
        do {
            sum += i;
            i++;
        }while(i<=10);
        System.out.println(sum);//55

        i = 1;
        int sum1 = 0;
        int sum2 = 0;
        do {
            if(i%2 == 0) {
                sum1 += i;
            }else {
                sum2 += i;
            }
            i++;
        }while(i<=100);
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
