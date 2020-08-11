package javabasic.day14.demo1;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/11 10:38 星期二
 */
public class Demo2 {
    public static void main(String[] args) {
        // 可变参数
        System.out.println(getSum(1,2,3,4,5,6,7,8));
    }

    public static int getSum(int... a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

}
