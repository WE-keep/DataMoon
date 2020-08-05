package javabasic.day06.demo1;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 11:52 星期三
 */
public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] arr = null;
        System.out.println(arr);
        //null
        //是用null  调用里面的东西
        //System.out.println(arr.length);

        String str = null;
        System.out.println("爱".equals(str));

        arr = new int[3];
        System.out.println(arr);
    }
}
