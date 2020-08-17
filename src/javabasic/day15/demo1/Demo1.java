package javabasic.day15.demo1;

import java.util.*;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/13 9:01 星期四
 */
public class Demo1 {
    public static void main(String[] args) {
        String str = "A:B,C,D,F,E,O;B:A,C,E,K;" +
                "C:F,A,D,I;D:A,E,F,L;" +
                "E:B,C,D,M,L;F:A,B,C,D,E,O,M;G:A,C,D,E,F;" +
                "H:A,C,D,E,O;I:A,O;J:B,O;K:A,C,D;" +
                "L:D,E,F;M:E,F,G;O:A,H,I,J";
    }

    private static void getAllSampFriend(String str) {
        String[] sp = str.split(";");
        HashMap<String, ArrayList<String>> hm = new HashMap<>(16);;

        for (String s : sp) {
            String[] persons = s.split(":");

            String[] friends = persons[1].split(",");

            List<String> list = Arrays.asList(friends);
            ArrayList<String> a = new ArrayList<>(list);

            hm.put(persons[0],a);
        }

        Set<String> st = hm.keySet();

        ArrayList<String> keys = new ArrayList<>(st);

        for (int i = 0; i < keys.size(); i++) {
            for (int j = i + 1; j < keys.size(); j++) {
                String key1 = keys.get(i);
                String key2 = keys.get(j);

                ArrayList<String> a1 = hm.get(key1);
                ArrayList<String> temp = new ArrayList<>(a1);

                ArrayList<String> a2 = hm.get(key2);

                temp.retainAll(a2);

                if (!temp.isEmpty()) {
                    System.out.println(key1 + "和" + key2 + "的共同好友为:" + temp);
                }
            }
        }
    }

    private static void getSampleFriend(String str) {
        //第一次切割  区分用户和用户之间
        String[] sp = str.split(";");

        HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

        for (String s : sp) {
            String[] persons = s.split(":");
            String[] friends = persons[1].split(",");

            List<String> list = Arrays.asList(friends);

            ArrayList<String> a = new ArrayList<>(list);

            hm.put(persons[0], a);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个用户名");
        String name1 = sc.next();

        System.out.println("请输入第二个用户名");
        String name2 = sc.next();

        if (!hm.containsKey(name1.toUpperCase()) || !hm.containsKey(name2.toUpperCase())) {
            System.out.println("用户不存在,请重新运行");
            return;
        }

        ArrayList<String> a1 = hm.get(name1.toUpperCase());
        ArrayList<String> a2 = hm.get(name2.toUpperCase());

        a1.retainAll(a2);

        if (a1.isEmpty()) {
            System.out.println(name1.toUpperCase() + "和" + name2.toUpperCase() + "没有共同好友");
        } else {
            System.out.println(name1.toUpperCase() + "和" + name2.toUpperCase() + "的共同好友为:" + a1);
        }
    }
}
