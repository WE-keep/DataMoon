package javabasic.day14.demo4;

import java.util.HashMap;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/11 14:40 星期二
 */
public class Demo1 {
    public static void main(String[] args) {
        /*
        Map:键值对形式存在
            1.所有的操作只针对键 跟值无关
            2.一个键只能出现一次，映射一个值
            3.键不能够重复,重复之后会被顶替
         */
        HashMap<String,String> hm = new HashMap<>();

        hm.put("天龙八部","金庸");
        hm.put("水浒传","曹雪芹");
        hm.put("萧十一郎","古龙");

        System.out.println(hm);

        System.out.println(hm.get("天龙八部"));
        System.out.println(hm.size());
        hm.remove("天龙八部");
        System.out.println(hm);

        System.out.println(hm.containsKey("天龙八部"));
        System.out.println(hm.containsValue("古龙"));

    }
}
