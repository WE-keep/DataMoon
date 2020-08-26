package javabasic.review.day13;

import java.util.*;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/21 15:55 星期五
 */
public class CollectionTest {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(16);
        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("d");
        // ArrayList内部已经将toString()方法重写
        System.out.println(arr);

/*        // 按照索引去除元素
        arr.remove(1);
        System.out.println(arr);

        // 按照元素去除元素
        arr.remove("d");
        System.out.println(arr);

        // 判断是否存在
        boolean a = arr.contains("a");
        System.out.println(a);

        // 判断是否为空
        boolean empty = arr.isEmpty();
        System.out.println(empty);

        int size = arr.size();
        System.out.println(size);

        arr.clear();
        System.out.println(arr);*/

/*        ArrayList<String> arr2 = new ArrayList<>();

        arr2.addAll(arr);
        System.out.println(arr2);

        arr2.add("f");
        boolean b = arr2.retainAll(arr);
        System.out.println(b);

        boolean b1 = arr2.contains(arr);
        System.out.println(b1);

        System.out.println("--------------");
        System.out.println(arr2);
        arr2.add("j");
        System.out.println(arr);
        boolean b2 = arr2.removeAll(arr);
        System.out.println(b2);
        System.out.println(arr2);


        System.out.println("----------------");
        // 使用iterator()进行遍历
        Object[] array = arr2.toArray();
        System.out.println(arr);

        Iterator<String> iterator = arr.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 使用增强for循环进行遍历
        for (String s : arr) {
            System.out.println(s);
        }

        System.out.println("---------------------");

        System.out.println(arr2);
        arr2.set(0, "k");
        System.out.println(arr2);

        arr2.add("o");
        arr2.add("w");
        arr2.add("r");
        System.out.println(arr2);

        System.out.println("-----------");

        for (int i = 0; i < arr2.size(); i++) {
            System.out.println(arr2.get(i));
        }*/
/*        ArrayList<Person> people = new ArrayList<>();
        String str = "张三,18,男;李四,39,女;王五,36,男";
        String[] split = str.split(";");
        for (int i = 0; i < split.length; i++) {
            String[] strings = split[i].split(",");
            people.add(new Person(strings[0],Integer.parseInt(strings[1]),strings[2]));
        }
        System.out.println(people);*/

        List<String> list = new ArrayList<String>();
        list.add("大乔");
        list.add("小乔");
        list.add("二乔");
        list.add("大乔");
        list.add("二乔");
        list.add("大乔");
        list.add("小乔");
        list.add("大乔");

        System.out.println("befor:" + list);
/*        // 使用set集合
        Set<String> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }
        System.out.println(set);*/


/*        // 新建一个集合，先判断老集合中是否包含这个元素，不包含就将其放进去
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!temp.contains(list.get(i))) {
                temp.add(list.get(i));
            }
        }
        System.out.println("after:" + temp);*/

        // 利用选择排序的思想进行去重
        // 注意内层循环的初始值取值
/*        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }
        System.out.println("after:" + list);*/


        // LinkedList
/*        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        System.out.println(list1);
        list1.addFirst(0);
        list1.addLast(7);
        System.out.println(list1);

        System.out.println(list1.getFirst());
        System.out.println(list1.getLast());

        System.out.println(list1.removeFirst());
        System.out.println(list1.removeLast());
        System.out.println(list1);*/

/*        System.out.println(arr);

        Object[] array = arr.toArray();
        // 在调用 Arrays.asList的时候是调用的Arrays的内部类，并没有实现add和remove方法
        List<Object> objects = Arrays.asList(array);
        System.out.println(objects);*/

/*        // 生成10个不重复的1-20之间的随机数
        // TreeSet可以对里面的元素进行去重和排序
        Random random = new Random();
        TreeSet<Integer> set = new TreeSet<>();
        while (set.size() != 10) {
            int i = random.nextInt(20) + 1;
            set.add(i);
        }
        System.out.println(set);*/

/*        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(5,"e");
*//*        System.out.println(map);
        boolean b = map.containsKey(1);
        boolean a = map.containsValue("a");
        String s = map.get(1);
        System.out.println(map.get(3));*//*
        Set<Integer> set = map.keySet();
        for (Integer integer : set) {
            System.out.println(map.get(integer));
        }*/



    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    // 可变参数，和main函数中的参数类似
    public static int getSum(int... args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }

}

class Person {
    private String name;
    private int age;
    private String sex;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Person() {
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
