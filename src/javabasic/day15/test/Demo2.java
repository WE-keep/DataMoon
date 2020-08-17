package javabasic.day15.test;

/*
A:B,C,D,F,E,O;B:A,C,E,K;C:F,A,D,I;D:A,E,F,L;E:B,C,D,M,L;F:A,B,C,D,E,O,M;G:A,C,D,E,F;H:A,C,D,E,O;I:A,O;J:B,O;K:A,C,D;L:D,E,F;M:E,F,G;O:A,H,I,J

1.获取所有用户对应的好友数量
2 获取指定两个用户的共同好友
3 获取两两人的共同好友
 */

import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        String str = "A:B,C,D,F,E,O;B:A,C,E,K;" +
                "C:F,A,D,I;D:A,E,F,L;" +
                "E:B,C,D,M,L;F:A,B,C,D,E,O,M;G:A,C,D,E,F;" +
                "H:A,C,D,E,O;I:A,O;J:B,O;K:A,C,D;" +
                "L:D,E,F;M:E,F,G;O:A,H,I,J";


//        getFriendNum(str);


//      获取指定两个用户的共同好友
//        getSampleFriend(str);

        getAllSampleFriend(str);
    }

    /**
     * 获取两两人的共同好友
     * @param str
     */
    private static void getAllSampleFriend(String str) {
        //第一次切割  区分用户和用户之间
        String[] sp = str.split(";");

        HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

        //第二次切割  将用户和其对应的好友部分分裂
        for (String s : sp) {
            String[] persons = s.split(":");

            //第三次切割  将每个用户对应的好友进行分离操作
            String[] friends = persons[1].split(",");

            //将好友数组变成集合
            List<String> list = Arrays.asList(friends);

            ArrayList<String> a = new ArrayList<>(list);

            //将用户和他对应的好友都存进集合中
            hm.put(persons[0], a);
        }

        Set<String> st = hm.keySet();

        ArrayList<String> keys = new ArrayList<>(st);

        for (int i = 0; i < keys.size() - 1; i++) {
            for (int j = i + 1; j < keys.size(); j++) {
                //先将对应的用户名取出
                String key1 = keys.get(i);
                String key2 = keys.get(j);

                //取出用户在map集合中对用的好友集合
                ArrayList<String> a1 = hm.get(key1);
                ArrayList<String> temp = new ArrayList<>(a1);

                ArrayList<String> a2 = hm.get(key2);

                //取交集
                temp.retainAll(a2);

                //打印交集信息
                if (!temp.isEmpty()) {
                    System.out.println(key1 + "和" + key2 + "的共同好友为:" + temp);
                }
            }

        }

    }


    /**
     * 获取两个指定用户的共同好友
     *
     * @param str
     */
    private static void getSampleFriend(String str) {
        //第一次切割  区分用户和用户之间
        String[] sp = str.split(";");

        HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

        //第二次切割  将用户和其对应的好友部分分裂
        for (String s : sp) {
            String[] persons = s.split(":");

            //第三次切割  将每个用户对应的好友进行分离操作
            String[] friends = persons[1].split(",");

            //将好友数组变成集合
            List<String> list = Arrays.asList(friends);

            ArrayList<String> a = new ArrayList<>(list);

            //将用户和他对应的好友都存进集合中
            hm.put(persons[0], a);
        }


        //求交集
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个用户名");
        String name1 = sc.next();

        System.out.println("请输入第二个用户名");
        String name2 = sc.next();

        //判断集合中是否包含对应的用户,如果不包含  就打印用户不存在
        if (!hm.containsKey(name1.toUpperCase()) || !hm.containsKey(name2.toUpperCase())) {
            System.out.println("用户不存在,请重新运行");
            return;
        }

        //将用户对应的好友的集合取出  然后求交集
        ArrayList<String> a1 = hm.get(name1.toUpperCase());
        ArrayList<String> a2 = hm.get(name2.toUpperCase());

        a1.retainAll(a2);


        //判断交集是否为空  如果为空  证明没有共同好友
        if (a1.isEmpty()) {
            System.out.println(name1.toUpperCase() + "和" + name2.toUpperCase() + "没有共同好友");
        } else {
            System.out.println(name1.toUpperCase() + "和" + name2.toUpperCase() + "的共同好友为:" + a1);
        }


    }


    /**
     * 获取每个用户的好友数量
     *
     * @param str
     */
    private static void getFriendNum(String str) {
        //第一次切割  区分用户和用户之间
        String[] sp = str.split(";");

        HashMap<String, Integer> hm = new HashMap<>();

        //第二次切割  将用户和其对应的好友部分分裂
        for (String s : sp) {
            String[] persons = s.split(":");

            //第三次切割  将每个用户对应的好友进行分离操作
            String[] friends = persons[1].split(",");

            //将好友数组的长度当做好友数量存进map集合
            hm.put(persons[0], friends.length);

        }


        System.out.println(hm);

    }
}
