package javabasic.day09.Demo6;
/*
接口：功能的拓展    原先不具备的功能    经过后天的学习 学会的 定义为接口
如何定义一个接口：
interface   近似于 class

interface 接口名 {
    方法;
}

注意事项：
    1.接口中所有的方法都是抽象方法 即使没有写abstract   系统也会默认给你加上abstract
    2.接口没有构造方法，不能创建对象
        可以使用接口多态的形式调用接口与中的值
    3.接口中可以有变量，但是所有的变量都是常量，前面默认加上 static final
    4.接口使用implements进行实现
        class 类名 implements {
            方法体;
        }
    5.实现了接口之后，必须实现接口中的所有方法，抽象类除外
    6.类和接口之间是多实现关系
    7.接口和接口之间只能是继承关系，而且接口与接口之间是多继承
 */
public class Demo1 {
    public static void main(String[] args) {
        System.out.println(111);
    }
}

interface DogInterface {
    void eat();
}

