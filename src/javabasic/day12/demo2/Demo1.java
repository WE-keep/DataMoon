package javabasic.day12.demo2;

import java.util.Arrays;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/8 10:39 星期六
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(arr));
        selectSort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(arr2));
        bubbleSort(arr2);
        System.out.println(Arrays.toString(arr2));

    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
