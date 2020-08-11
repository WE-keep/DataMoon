package javabasic.day13.demo4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/10 17:04 星期一
 */
public class Demo1 {
    public static void main(String[] args) {
        /*
        List    存取有序的集合,允许重复元素
            void add(int index, E element)

         */
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        list.add(1,9);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.set(1,8);
        System.out.println(list);

        System.out.println(list.get(1));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("------------");
        ListIterator<Integer> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
