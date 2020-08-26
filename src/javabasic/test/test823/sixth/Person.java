package javabasic.test.test823.sixth;

import java.io.Serializable;
import java.util.Objects;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/23 10:32 星期日
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String city;
    private double income;

    public Person() {
    }

    public Person(String name, int age, String city, double income) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.income = income;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Person)) {
            return false;
        }
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                Double.compare(person.getIncome(), getIncome()) == 0 &&
                getName().equals(person.getName()) &&
                getCity().equals(person.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getCity(), getIncome());
    }

    @Override
    public String toString() {
        return name +"\t" + age + "\t" + city + "\t" + income;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
}
