package javabasic.day09.demo2;

public class AnimalProduce {
    public static void main(String[] args) {
        Cat cat = new Cat();
        makeAnimal(cat,"cat");

        Monkey monkey = new Monkey();
        makeAnimal(monkey,"monkey");
    }

    public static void makeAnimal(Animal ani, String name) {
        if (ani instanceof Cat) {
            ani.name = "小白";
            ani.age = 3;
        } else if (ani instanceof Dog) {
            ani.name = "大黄";
            ani.age = 10;
        } else if (ani instanceof Monkey) {
            ani.name = "大圣";
            ani.age = 500;
        } else {
            System.out.println("未知类型参数");
        }
/*        if ("dog".equals(name)) {
            ani.name = "大黄";
            ani.age = 10;
        } else if ("cat".equals(name)) {
            ani.name = "小白";
            ani.age = 3;
        } else if ("monkey".equals(name)) {
            ani.name = "悟空";
            ani.age = 500;
        }*/
        ani.eat();
    }
}

