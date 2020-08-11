package javabasic.day14.demo4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/11 14:52 星期二
 */
public class Demo2 {
    public static void main(String[] args) {
        /*
        keySet
        entrySet
        values
         */
        HashMap<String,String> hm = new HashMap<>();

        hm.put("天龙八部","金庸");
        hm.put("水浒传","曹雪芹");
        hm.put("萧十一郎","古龙");
        hm.put("万花洗剑录","古龙");

        // 通过使用keySet方法将所有键取出，并封装进set集合中
        Set<String> set = hm.keySet();
        for (String key : set) {
            System.out.println(key + "\t\t" + hm.get(key));
        }

        System.out.println("------------------");
        //将map集合地点键值对进行打包，封装到entry中
        Set<Map.Entry<String, String>> entries = hm.entrySet();

        for (Map.Entry<String, String> e : entries) {
            System.out.println(e.getKey() + "\t\t" + e.getValue());
        }
    }
}
