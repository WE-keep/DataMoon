package javabasic.test.test823.second;

import java.util.Arrays;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/23 9:23 星期日
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] testArr = {1, 5, 8, 3, 9};
        System.out.println(Arrays.toString(testArr));
        quickSort(testArr, 0, testArr.length - 1);
        System.out.println(Arrays.toString(testArr));
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start > end) {
            return;
        }

        int i = start;
        int j = end;
        int base = arr[start];

        while (i < j) {
            while (arr[j] >= base && i < j) {
                j--;
            }
            while (arr[i] <= base && i < j) {
                i++;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[start] = arr[i];
        arr[i] = base;

        quickSort(arr, start, i - 1);
        quickSort(arr, i + 1, end);
    }
}
