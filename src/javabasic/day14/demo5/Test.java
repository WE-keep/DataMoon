package javabasic.day14.demo5;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/11 20:40 星期二
 */
public class Test {
    public static void main(String[] args){
    }
}
interface Person {
    public void eat();

    public void sleep();

    public void study();
}

class Student implements Person {

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }

    @Override
    public void study() {
        System.out.println("study");
    }
}