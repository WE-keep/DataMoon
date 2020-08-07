package javabasic.day11.demo5;

import java.util.Arrays;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/7 17:31 星期五
 */
public class Demo2 {
    public static void main(String[] args) {
        String s = "小明，22，男；小红，20，女；小城，20，男";
        String[] split = s.split("；");
        Person[] people = new Person[split.length];
        for (int i = 0; i < split.length; i++) {
            String[] temp = split[i].split("，");
            people[i] = new Person(temp[0],temp[1],temp[2]);
        }
        System.out.println(Arrays.toString(people));
    }
}
class Person {

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    private String name;
    private String age;
    private String sex;

    public Person() {
    }

    public Person(String name, String age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}