package javabasic.day11.demo5;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/7 17:19 星期五
 */
public class Demo1 {
    public static void main(String[] args) {
        String s1 = "helloword";
        String replace = s1.replace('h', 'r');
        System.out.println(s1);
        //helloword
        System.out.println(replace);
        //relloword

        String replace1 = s1.replace("word", "java");
        System.out.println(replace1);
        //hellojava


    }
}
