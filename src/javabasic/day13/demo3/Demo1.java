package javabasic.day13.demo3;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/10 15:18 星期一
 */
public class Demo1 {
    public static void main(String[] args) {
        /*
        集合：
            数据存储的容器
            不能存储基本类型
            内部元素可以是任意类型

         数组：
            引用类型和基本数据类型
            内部元素类型统一
            数组的长度固定不变

          Collection接口
            泛型只在编译器有用，过了编译器就没有作用了
            boolean add(E e)
            boolean remove(Object o)
            void clear()
            boolean contains(Object o)
            boolean isEmpty()
            int size()      集合的长度
         */
        Collection list = new ArrayList();
        list.add("111");
        System.out.println(list);

        list.add(new int[] {1,2,3,4,5});
        System.out.println(list);

        list.remove("111");
        System.out.println(list);

        System.out.println(list.size());
        list.add("hello");
        System.out.println(list.contains("hello"));

        list.clear();
        System.out.println(list);

        System.out.println(list.isEmpty());

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);
        for (Object o : list) {
            System.out.println(o);
        }


    }
}
