package javabasic.day12.demo4;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/8 16:23 星期六
 */
public class Demo3 {
    public static void main(String[] args) {
        /*
        进制转换
            toBinaryString(int num)
            toOctalString(int i)
            toHexString(int x)

            toString(int i, int radix)      //十进制转换为指定进制
            parseInt(String a, int radix)   //其他进制转换为十进制
            最高进制到36进制
         */

        int i = 100;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toOctalString(i));
        System.out.println(Integer.toHexString(i));

        System.out.println(Integer.toString(i,8));
        System.out.println(Integer.parseInt("10101010101001",2));
    }
}
