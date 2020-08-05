package javabasic.day05.demo3;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 11:42 星期三
 */
public class NineNineTableDemo {
    public static void main(String[] args) {
        System.out.println("\"helloworld\"");
        for(int i=1;i<=9;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j+"x"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
    }
}
