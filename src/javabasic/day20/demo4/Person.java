package javabasic.day20.demo4;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/20 11:19 星期四
 */
public class Person {
    private String name;
    int age;
    public String sex;

    private static void sayHello(int a) {
        System.out.println("hello" + a);
    }

    public static void show() {
        System.out.println("hello");
    }

    public Person() {
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name) {
        this.name = name;
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
        System.out.println("seting");
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
        System.out.println("我" + this.age);
    }

    public String getSex() {
        return sex;
    }

    private void setSex(String sex) {
        this.sex = sex;
        System.out.println("hello" + this.sex);
    }
}
