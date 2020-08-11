package javabasic.day14.demo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/11 11:07 星期二
 */
public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("f");

        Object[] objects = list.toArray();
        System.out.println(objects);

        String[] str = {"a","b","c","d","e"};
        List<String> list1 = Arrays.asList(str);

        ArrayList<String> list2 = new ArrayList<>(list1);
        list2.add("f");
        System.out.println(list2);
    }
}
