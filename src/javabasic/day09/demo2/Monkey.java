package javabasic.day09.demo2;

public class Monkey extends Animal{
    @Override
    public void eat() {
        System.out.println("猴子吃棒棒糖");
    }

    public void shout() {
        System.out.println("猴子吱吱叫");
    }
}
