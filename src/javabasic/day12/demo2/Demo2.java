package javabasic.day12.demo2;

import java.util.Arrays;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/8 10:39 星期六
 */
public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr,7));

        int[] testArr = {13,2,6,9};
        quickSort(testArr,0,testArr.length - 1);
        System.out.println(Arrays.toString(testArr));



    }

    /**
     * 二分查找必须是有序的
     * @param arr   查找的数组
     * @param target    目标值
     */
    public static boolean binarySearch(int[] arr,int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == arr[mid]) {
                return true;
            } else if (target > arr[mid]) {
                left = mid + 1;
            } else if (target < arr[mid]) {
                right = mid - 1;
            }
        }
        return false;
    }

    /**
     * 快速排序
     * @param arr   要排序的数组
     * @param low   要排序的起点
     * @param height    排序的终点
     */
    public static void quickSort(int[] arr, int low, int height) {
        if (low > height) {
            return;
        }

        int i = low;
        //定义i哨兵
        int j = height;
        int base = arr[low];
        //定义基准值
        
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
        //让i和j遇见的值做交换
        arr[low] = arr[i];
        arr[i] = base;

        quickSort(arr,low,i - 1);
        quickSort(arr,i + 1, height);
    }




}
