package javabasic.day13.demo3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/10 16:31 星期一
 */
public class Demo3 {
    public static void main(String[] args) {
        /*
        遍历数组
            toArray()
            Iterator iterator()
                hasNext()
                next()
                remove()
         */
        Collection<String> c= new ArrayList<String>();
        c.add("java");
        c.add("php");
        c.add("golang");
        c.add("c++");


        for (String s : c) {
            System.out.println(s);
        }

        /*Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/
    }
}
