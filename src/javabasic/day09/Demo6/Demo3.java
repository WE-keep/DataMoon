package javabasic.day09.Demo6;

public class Demo3 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "小花";
        cat.speak();
        cat.eat();
    }
}

abstract class Animal {
    String name;
    public abstract void speak();
}
interface Pet {
    public void eat();
}

class Cat extends Animal implements Pet {

    @Override
    public void eat() {
        System.out.println("I want to eat some fish");
    }

    @Override
    public void speak() {
        System.out.println("maio, my name is " + name);
    }
}