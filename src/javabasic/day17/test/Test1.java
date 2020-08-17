package javabasic.day17.test;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/16 16:18 星期日
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        /*
            1 获取所有用户对应的好友数量
            2 获取指定两个用户的共同好友
            3 获取两两人的共同好友信息
            4 将以上三部的结果集写在本地磁盘
         */
//        getFriend();
        getCommonFriend("A", "F");

    }

    public static void getFriend() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/javabasic/day17/test/friend.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/javabasic/day17/test/friend1.txt"));
        HashMap<String, ArrayList<String>> hm = new HashMap<>(16);

        String str = null;
        while ((str = reader.readLine()) != null) {
            String[] split = str.split(":");
            String[] split1 = split[1].split(",");

            ArrayList<String> temp = new ArrayList<>(16);
            for (String s : split1) {
                temp.add(s);
            }
            hm.put(split[0], temp);
        }
        Set<String> keySet = hm.keySet();
        for (String s : keySet) {
            System.out.println(s + ":" + hm.get(s).size());
        }
    }

    public static void getCommonFriend(String user1, String user2) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/javabasic/day17/test/friend.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/javabasic/day17/test/friend1.txt"));
        HashMap<String, ArrayList<String>> hm = new HashMap<>(16);

        String str = null;
        while ((str = reader.readLine()) != null) {
            String[] split = str.split(":");
            String[] split1 = split[1].split(",");

            ArrayList<String> temp = new ArrayList<>(16);
            for (String s : split1) {
                temp.add(s);
            }
            hm.put(split[0], temp);
        }

        ArrayList<String> user1List = hm.get(user1);
        ArrayList<String> user2List = hm.get(user2);

        ArrayList<String> temp2 = new ArrayList<>(16);

        temp2.addAll(user1List);
        temp2.retainAll(user2List);

        System.out.println(temp2.toString());

    }


}
