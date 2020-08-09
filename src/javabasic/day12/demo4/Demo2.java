package javabasic.day12.demo4;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/8 16:14 星期六
 */

public class Demo2 {
    public static void main(String[] args) {
        /*
        public Integer(int value)
        public Integer(String s)
         */
        Integer integer = new Integer("+12345");
        System.out.println("integer = " + integer);

        /*
        int 类型和String类型转换
            int     String  直接使用空字符串
            String  int：    parseInt(String s)  s必须是纯数字的字符串
         */
        int i = Integer.parseInt("33443565");
        System.out.println(i);

    }
}
