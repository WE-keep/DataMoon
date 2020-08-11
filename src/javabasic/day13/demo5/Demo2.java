package javabasic.day13.demo5;

import java.util.Objects;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/10 17:30 星期一
 */
public class Demo2 {
    public static void main(String[] args) {

    }
}

class Person {
    private String name;
    private int age;
    private String sex;

    public Person() {
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                getName().equals(person.getName()) &&
                getSex().equals(person.getSex());
    }



    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
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
