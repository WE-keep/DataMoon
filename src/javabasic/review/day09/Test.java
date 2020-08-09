package javabasic.review.day09;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/7 21:35 星期五
 */
public class Test {
    public static void main(String[] args) {
        Animal am = new Cat();
        //向上转型
        am.eat();
        //猫吃饭
        am.sleep();
        //动物在睡觉
        am.run();
        //动物在奔跑
        System.out.println(am.num);
        //10
        System.out.println(am.age);
        //20
//        am.catchMouse();//报错,无法调用子类独有
//        System.out.println(am.name);//报错,无法调用子类独有
        Cat ct = (Cat)am;
        //向下转型
        ct.sleep();
        //猫在睡觉
        ct.run();
        //动物在奔跑
    }
}

class Cat extends Animal {
    int num = 80;
    static int age = 90;
    String name = "tomCat";
    @Override
    public void eat() {
        System.out.println("猫吃饭");
    }
    public static void sleep() {
        System.out.println("猫在睡觉");
    }
    public void catchMouse() {
        System.out.println("猫在抓老鼠");
    }
}

class Animal {
    int num = 10;
    static int age = 20;
    public void eat() {
        System.out.println("动物吃饭");
    }
    public static void sleep() {
        System.out.println("动物在睡觉");
    }
    public void run(){
        System.out.println("动物在奔跑");
    }
}
