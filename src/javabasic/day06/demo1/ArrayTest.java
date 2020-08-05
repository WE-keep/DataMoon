package javabasic.day06.demo1;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 11:46 星期三
 */
public class ArrayTest {
    public static void main(String[] args) {
        String[] arr = new String[4];
        arr[0] = "春季";
        arr[1] = "夏季";
        arr[2] = "秋季";
        arr[3] = "冬季";

        char[] arr2 = new char[4];
        arr2[0] = '多';
        arr2[1] = '易';
        arr2[2] = '教';
        arr2[3] = '育';

        int[] arr3 = new int[10];
		/*arr3[0] = 1;
		arr3[1] = 2;
		arr3[2] = 3;
		arr3[3] = 4;
		arr3[4] = 5;
		arr3[5] = 6;
		arr3[9] = 10;*/
        for(int i=0;i<=9;i++) {
            arr3[i] = i+1;
        }
        System.out.println(arr3[0]);
        System.out.println(arr3[5]);
        System.out.println(arr3[9]);
    }
}
