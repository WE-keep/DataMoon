package javabasic.day06.demo1;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 11:51 星期三
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        char[] chs = {'多','易','教','育'};
        for(int i=0;i<chs.length;i++) {
            System.out.println(chs[i]);
        }

        boolean[] arr = {false,false,true,true};

        int[] arr2 = new int[] {12,3,43,4,54};
        int sum = 0;
        for(int i=0;i<arr2.length;i++) {
            sum += arr2[i];
        }

        System.out.println(sum);
        System.out.println((double)sum/arr2.length);
    }
}
