package javabasic.day06.demo1;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 11:47 星期三
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr = new int[5];// 创建一个5个长度的int类型的数组 arr

        System.out.println(arr);//[I@7852e922
        System.out.println(arr[0]);//0
        System.out.println(arr[2]);
        System.out.println(arr[4]);

        arr[3] = 100;
        System.out.println(arr[3]);

        String[] arr2 = new String[3];
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        arr2[1] = "大";
        System.out.println(arr2[1]);

        String[] arr3 = new String[4];
        arr3[1] = "小";
        arr3 = arr2;
        System.out.println(arr2[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
    }
}
