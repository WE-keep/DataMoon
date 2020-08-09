package javabasic.day09.demo2;

public class Dog extends Animal{
    String name;
    int age;
    String sex;

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void sleep() {
        System.out.println("狗躺着睡觉");
    }
}
