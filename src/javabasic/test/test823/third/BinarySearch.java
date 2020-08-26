package javabasic.test.test823.third;

import com.sun.org.apache.bcel.internal.generic.ATHROW;

import java.util.Arrays;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/23 9:51 星期日
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] testArr = {5,8,1,9,7,6,3};
        System.out.println("Sort befor: " + Arrays.toString(testArr) );
        Arrays.sort(testArr);
        System.out.println("Sort after: " + Arrays.toString(testArr));
        binarySearch(testArr,7);
    }
    public static void binarySearch(int[] arr, int target) {
        if (arr.length < 0 || arr == null) {
            System.out.println("数组不符合要求");
            return;
        }
        int left = 0;
        int right = arr.length - 1;
        int middle = (left + right) / 2;

        while (left <= right) {
            if (target == arr[middle]) {
                System.out.println("index: " + middle);
                return;
            } else if (target > arr[middle]) {
                left = middle + 1;
                middle = (left + right) / 2;
            } else if (target < arr[middle]) {
                right = middle - 1;
                middle = (left + right) / 2;
            }
        }
    }
}
