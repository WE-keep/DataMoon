package javabasic.day14.demo3;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/11 11:38 星期二
 */
public class Demo1 {
    public static void main(String[] args) {
        /*
        hashSet
        1 - 20之间的随机数
         */
        Set<Integer> integers = new HashSet<>();
        Random random = new Random();
        while (integers.size() <= 10) {
            integers.add((random.nextInt(20) + 1));
        }
        System.out.println(integers);
    }
}
