package javabasic.day12.demo1;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/8 9:27 星期六
 */
public class Demo1 {
    public static void main(String[] args) {
        /*
        StringBuffer:   线程安全的字符串缓冲序列    效率低
        StringBuilder:   线程不安全的字符串缓冲序列    效率高
         */

        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.length());
        //0
        System.out.println(stringBuffer.capacity());
        //16
        StringBuffer sb2 = new StringBuffer(32);
        System.out.println(sb2.capacity());
        //32

        StringBuffer sb3 = new StringBuffer("helloworld");
        System.out.println(sb3.capacity());
        //26    10 + 16
        System.out.println(sb3.length());
        //10
    }
}
