package javabasic.day06.demo2;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 11:53 星期三
 */
public class Test {
    public static void main(String[] args) {

    }
    public static void printArr(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            if(arr.length == 1) {
                System.out.println("["+arr[0]+"]");
            }else if(i == 0) {
                System.out.print("["+arr[i]+",");
            }else if(i == arr.length-1) {
                System.out.println(arr[i]+"]");
            }else {
                System.out.print(arr[i]+",");
            }
        }
    }

    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
