package javabasic.day05.demo3;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 11:34 星期三
 */
public class ForDemo {
    public static void main(String[] args) {

        for(int i = 65;i<65+26;i++) {
            System.out.println((char)i);
        }

        System.out.println("-------------");

        for(char i='A';i<='Z';i++) {
            System.out.println(i);
        }
        for(char i='a';i<='z';i++) {
            System.out.println(i);
        }
        /**
         * char : 直接打印:打印的是对应的字符
         * char:  参与运算,用的是底层的编码
         */
        char a ='a';
        char b = 97;
        System.out.println(a+1);//98
        System.out.println(b+1);//98
        int c = 97;
        System.out.println(c);
        System.out.println((char)(c+1));//b
    }
}
