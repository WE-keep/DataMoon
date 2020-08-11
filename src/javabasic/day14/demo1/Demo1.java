package javabasic.day14.demo1;

import java.util.LinkedList;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/11 10:11 星期二
 */
public class Demo1 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.save("caocao");
        myStack.save("guanyu");
        myStack.save("liubei");
        System.out.println(myStack);
    }
}
