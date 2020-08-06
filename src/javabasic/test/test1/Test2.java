package javabasic.test.test1;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/6 10:22 星期四
 */
public class Test2 {
    public static void main(String[] args) {

    }
    public int getIndex(int[] arr, int target) {
        //首先设定数组本身是有序的而且是顺序递增的
        int left = 0;
        int right = arr.length - 1;
        int mid = (left + right) / 2;
        while (left < right) {
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return -1;
    }
}
