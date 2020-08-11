package javabasic.day13.demo5;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/10 17:30 星期一
 */
public class Demo1 {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("张三");
        li.add("张大");
        li.add("张四");
        li.add("张无");
        li.add("张无");
        li.add("张其");
        li.add("张就");

        List<String> list = new ArrayList<>();
        for (int i = 0; i < li.size(); i++) {
            String s = li.get(i);
            if (!list.contains(s)) {
                list.add(s);
            }
        }
        System.out.println(li);
        System.out.println(list);

        System.out.println("-----------------");
        li.add("张三");
        li.add("张大");
        li.add("张四");
        li.add("张无");
        li.add("张无");
        li.add("张其");
        li.add("张就");

        System.out.println(li);
        //选择排序思想
        for (int i = 0; i < li.size() - 1; i++) {
            for (int j = i + 1; j < li.size(); j++) {
                if (li.get(i).equals(li.get(j))) {
                    li.remove(j);
                    j--;
                }
            }
        }


        System.out.println(li);

    }
}
