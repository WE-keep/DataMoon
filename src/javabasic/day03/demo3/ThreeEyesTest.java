package javabasic.day03.demo3;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5
 */
public class ThreeEyesTest {
    public static void main(String[] args){
        long a = 10000;
        long b = 345;

        long max = a>b?a:b;
        System.out.println("最大值为:" + max);

        float f1 = 123.9f;
        float f2 = 12;
        float f3 = 90.3f;

        float f4 = f1>f2?f1:f2;
        //  代表f1  f2 中的最大值
        float f = f3>f4?f3:f4;
        // 三个数中的最大值
        System.out.println("三个数中的最大值为:"+f);

        float max1 = f1>f2?(f1>f3?f1:f3):(f2>f3?f2:f3);
        //如果条件成立,f1是前两个数中的最值,只需比较f1和f3即可,反之比较 f2和f3
        float max2 = f1>f2&f1>f3?f1:(f2>f3?f2:f3);
        //条件成立,代表f1是最大值,条件不成立代表f1不是最大值,则最大值在f2和f3中产生

        System.out.println("三个数中的最大值为:"+max1);
        System.out.println("三个数中的最大值为:"+max2);


    }
}
