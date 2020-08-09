package javabasic.day11.demo4;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/7 16:20 星期五
 */
public class Demo2 {
    public static void main(String[] args) {
        String test = "hava hava java html java java java java";

        String str = "java";
        int times = 0;
        int i = test.indexOf(str);
        System.out.println(i);
        //10
        while (i != -1) {
            times++;
            i = test.indexOf("java",i + 1);
        }
        System.out.println("java一共出现：" + times + "次");


    }
}
