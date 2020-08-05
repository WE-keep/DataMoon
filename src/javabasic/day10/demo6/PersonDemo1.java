package javabasic.day10.demo6;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 16:27 星期三
 */
public class PersonDemo1 {
    public static void main(String[] args) {
        Fu fu = new Fu() {
            @Override
            public void show() {
                System.out.println("我是子类show方法");
            }

            @Override
            public void get() {
                System.out.println("我是子类get方法");
            }
        };
        fu.show();
        fu.get();

        PerInter perInter = new PerInter() {
            @Override
            public void eat() {
                System.out.println("eating");
            }

            @Override
            public void swim() {
                System.out.println("swim");
            }

            @Override
            public void sleep() {
                System.out.println("sleep");
            }
        };

        perInter.eat();
        perInter.sleep();
        perInter.swim();
    }
}
class Fu {
    public void show() {
        System.out.println("我是父类show方法");
    }

    public void get() {
        System.out.println("我是父类get方法");
    }
}

interface PerInter {
    public void eat();

    public void swim();

    public void sleep();

}
