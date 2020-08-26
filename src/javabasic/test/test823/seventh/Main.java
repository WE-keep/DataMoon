package javabasic.test.test823.seventh;

import javabasic.test.test823.seventh.pojo.Goods;
import javabasic.test.test823.seventh.pojo.Machine;

import java.util.HashMap;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/23 11:07 星期日
 */
public class Main {
    public static void main(String[] args) {
        Goods g1 = new Goods(1, "可乐", 4, 3.5);
        Goods g2 = new Goods(2, "薯片", 4, 4.5);
        Goods g3 = new Goods(3, "雪碧", 4, 3.0);

        HashMap<Integer, Goods> map = new HashMap<>(16);
        map.put(g1.getGoodId(),g1);
        map.put(g2.getGoodId(),g2);
        map.put(g3.getGoodId(),g3);
        Machine.setGoodsList(map);

        Machine machine = new Machine();
        machine.show();
    }
}
