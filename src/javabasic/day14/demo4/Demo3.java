package javabasic.day14.demo4;

import java.util.HashMap;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/11 15:12 星期二
 */
public class Demo3 {
    public static void main(String[] args) {
        String s = "abc";
        HashMap<Character,Integer> hm = new HashMap<>(16);

        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);


            if (hm.get(c) == null) {

                // !hm.containsValue(c)
                //  HashMap<Character,Integer> 引用数据类型，没有的话应该使用null比较
                hm.put(c,1);
            } else {

                /*int count = hm.get(c);
                count++;
                hm.put(c,count);
                */

                hm.put(c,hm.get(c).intValue() + 1);
            }
        }
        System.out.println(hm);
        //{a=4, r=2, s=4, d=3, t=2, e=3, f=3, g=4, h=2, y=2, j=3}
    }
}
