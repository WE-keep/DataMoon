package javabasic.day11.demo4;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/7 16:31 星期五
 */
public class Demo3 {
    public static void main(String[] args) {
        String str = "abcdFGJKHKUYUFGVG12342343JGVHFCbhyjgvjygvhsdf";
        /**
         * count1：记录小写字母的个数
         * count2：记录大写字母的个数
         * count3：记录数字的个数
         */
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (temp >= 'a' && temp <= 'z') {
                count1++;
            }
            if (temp >= 'A' && temp <= 'Z') {
                count2++;
            }
            if (temp >= '0' && temp <= '9') {
                count3++;
            }
        }
        System.out.println("大写字母个数" + count1);
        System.out.println("小写字母个数" + count2);
        System.out.println("数字个数" + count3);
    }
}
