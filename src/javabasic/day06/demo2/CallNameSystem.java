package javabasic.day06.demo2;

import java.util.Random;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 11:52 星期三
 */
public class CallNameSystem {
    public static void main(String[] args) {
        //1. 构建名字数组
        String[] names = new String[]{"张宇","刘淼","杨鑫宁","高英杰","牛心朔","冯志伟","杜垚","遆凯文","韩磊","陈晨","马鹏宇","袁志伟","吴振亚","张展翔","佟杰","刘孟凯"};

        //2 生成随机数
        Random r = new Random();
        //[0,arr.length-1]
        int index = r.nextInt(names.length);
        //[0,names.length);

        //3. 从数组中取出该索引对应的元素
        String name = names[index];

        System.out.println("请["+name+"]表演节目");
    }
}
