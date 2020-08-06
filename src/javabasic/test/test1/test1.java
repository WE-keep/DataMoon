package javabasic.test.test1;

import java.util.Arrays;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/6 10:06 星期四
 */
public class test1 {
    public static void main(String[] args) throws Exception{
        int[] testArr = {1,2,3,4,5,5,3};
        int[] result = getTop2Arr(testArr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] getTop2Arr(int[] arr) throws Exception {
        if (arr == null || arr.length < 2) {
            throw new Exception("数组为空或者长度太短");
        }
        //定义temp数组用来装最大的两个数
        int[] temp = new int[2];
        //先假设最大值是arr[0]
        int max1 = arr[0];
        //用来记录最大值所在的位置
        int index = 0;


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max1) {
                max1 = arr[i];
                index = i;
            }
        }
        temp[0] = max1;

        //假设第二大的是max2
        int max2 = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            if (max2 < arr[i]) {
                max2 = arr[i];
            }

        }
        temp[1] =  max2;
        return temp;
    }
}
