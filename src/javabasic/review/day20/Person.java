package javabasic.review.day20;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/20 17:39 星期四
 */
public class Person {
    private String name;
    int age;
    public String sex;

    public Person() {
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    private void sayHello() {
        System.out.println("Hello");
    }
}
