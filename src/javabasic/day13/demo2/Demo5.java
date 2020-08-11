package javabasic.day13.demo2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/10 14:39 星期一
 */
public class Demo5 {
    public static void main(String[] args) {
        String s1 = "ii,kk,kk";
        String[] split = s1.split(",");
        System.out.println(Arrays.toString(split));
        System.out.println("-----------------");



        String s = "19 89 76 3 65";
        String[] split1 = s.split("\\s");
        int[] arr = new int[split1.length];

        for (int i = 0; i < split1.length; i++) {
            arr[i] = Integer.parseInt(split1[i]);
        }

        System.out.println(Arrays.toString(arr));
    }
}
