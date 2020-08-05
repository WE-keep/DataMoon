package javabasic.day09.Demo4;

public class Demo1 {
    public static void main(String[] args) {
        Person person = new Student();
        System.out.println(person.name);
        person.show();
    }
}
abstract class Person {
    String name = "caoca";
    public abstract void sleep();
    public void show() {
        System.out.println("show ING");
    }
}

class Student extends  Person {
    @Override
    public void sleep() {
        System.out.println("早早的睡觉");
    }
}

class Teacher extends Person {
    @Override
    public void sleep() {
        System.out.println("备完课再睡觉");
    }
}