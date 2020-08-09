package javabasic.day12.demo1;

import java.util.Arrays;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/8 9:53 星期六
 */
public class Demo3 {
    public static void main(String[] args) throws Exception {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(printArr(arr));

    }


    private static String printArr(int[] object) throws Exception{
        if (object == null || object.length < 0) {
            throw new Exception("输入的数组不符合要求");
        }
        int max = object.length - 1;
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < object.length; i++) {
            if (i == max) {
                stringBuilder.append(object[i] + "]");
            } else {
                stringBuilder.append(object[i] + ",");
            }
        }

        return stringBuilder.toString();
    }
}
