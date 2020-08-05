package javabasic.day09.demo1;

public class ObjectDemo1 {
    public static void main(String[] args) {
        Person p = new Student();
        System.out.println(p.name); //人
        System.out.println(p);
        p.show();                   //Hello World

//        p.eat();        //报错
        Student s = (Student)p;     //向下转型
        s.eat();
        System.out.println(s);
    }
}

class Person {
    String name = "人";

    public void show() {
        System.out.println("你好");
    }
}

class Student extends Person {
    String name = "Student";

    @Override
    public void show() {
        System.out.println("Hello World");
    }

    public void eat() {
        System.out.println("eating");
    }
}