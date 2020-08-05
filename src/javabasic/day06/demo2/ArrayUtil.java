package javabasic.day06.demo2;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 11:55 星期三
 */
public class ArrayUtil {
    public static void main(String[] args) {

    }
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr.length == 1) {
                System.out.println("[" + arr[0] + "]");
            } else if (i == 0) {
                System.out.print("[" + arr[i] + ",");
            } else if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }

    public static void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr.length == 1) {
                System.out.println("[" + arr[0] + "]");
            } else if (i == 0) {
                System.out.print("[" + arr[i] + ",");
            } else if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }

    public static void printMaxAndMin(int[] arr) {
        //2.设置一个变量存储最大值
        int max = arr[0];
        int min = arr[0];
        //3.遍历数组,用max和数组中的元素作比较
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                //重新赋值
                max = arr[i];
            }
            //最小值的比较,如果数组中的元素比最小值还小
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        //4.在循环的外边打印最大值
        System.out.println("最大值为:" + max);
        System.out.println("最小值为:" + min);
    }



}
