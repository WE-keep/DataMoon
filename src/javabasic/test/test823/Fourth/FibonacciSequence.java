package javabasic.test.test823.Fourth;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/23 10:04 星期日
 */
public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println(fibonacciSequence(1));
        System.out.println(fibonacciSequence(2));
        System.out.println(fibonacciSequence(3));
        System.out.println(fibonacciSequence(4));
        System.out.println(fibonacciSequence(5));
        System.out.println(fibonacciSequence(6));
    }

    public static int fibonacciSequence(int month) {
        if (month < 0) {
            return -1;
        } else if (month == 1 || month == 2) {
            return 2;
        } else {
            int[] temp = new int[month];
            temp[0] = 1;
            temp[1] = 1;
            for (int i = 2; i < month; i++) {
                temp[i] = temp[i - 1] + temp[i - 2];
            }
            return 2 * temp[month - 1];
        }
    }
}
