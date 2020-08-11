package javabasic.day13.demo4;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/10 17:22 星期一
 */
public class Demo2 {
    public static void main(String[] args) {
        String s = "张倩,23,女;李四,34,男";

        String[] split = s.split("；");
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            String[] split1 = split[i].split("，");
            people.add(new Person(split1[0],Integer.parseInt(split1[1]),split1[2]));
        }

        System.out.println(people);
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

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}