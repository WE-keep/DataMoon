package javabasic.day14.demo5;

import java.util.HashMap;
import java.util.Objects;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/11 15:56 星期二
 */
public class Demo1 {
    public static void main(String[] args) {
        String start = "成龙，1000；李冰冰，20000；李连杰，46456；李冰冰，345345；成龙，23534";
        String[] split = start.split("；");

        HashMap<String, Start> hm = new HashMap<>(16);

        for (int i = 0; i < split.length; i++) {
            String[] strings = split[i].split("，");
            if (!hm.containsKey(strings[0])) {
                hm.put(strings[0], new Start(strings[0], Integer.parseInt(strings[1]), 1));
            } else {
                double tempMoney = hm.get(strings[0]).getMoney() + Integer.parseInt(strings[1]);
                int tempCount = hm.get(strings[0]).getCount() + 1;
                hm.put(strings[0], new Start(strings[0], tempMoney, tempCount));
            }
        }

        System.out.println(hm);
    }
}

class Start {
    private String name;
    private double money;
    private int count;


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Start)) {
            return false;
        }
        Start start = (Start) o;
        return Double.compare(start.getMoney(), getMoney()) == 0 &&
                getCount() == start.getCount() &&
                getName().equals(start.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMoney(), getCount());
    }

    @Override
    public String toString() {
        return "Start{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", count=" + count +
                '}';
    }

    public Start() {
    }

    public Start(String name, double money, int count) {
        this.name = name;
        this.money = money;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
