package java_basic.day09.demo5;
/*
​   1）定义一个抽象类Animal，其中包括属性name，相关构造方法，抽象方法enjoy()表示动物高兴时动作。

​	2）定义Cat类继承于Animal类，其中包括属性eyesColor，相关构造方法，同时具体化父类中的抽象方法。

​	3）定义Dog类继承于Animal类，其中包括属性furColor，相关构造方法，同时具体化父类中的抽象方法。

    ​4）定义Lady类，其中包括属性name,以及Animal 类型的属性pet表示女士所养的宠物，定义构造方法，
    生成女士对象时初始化姓名和她所养的宠物。
    定义一个方法：myPetEnjoy表示此女士的宠物在高兴时的动作。提示：对于此类的定义中需要使用到多态性。

​	5）定义测试类。
 */
public class Demo2 {
    public static void main(String[] args) {
        Lady lady = new Lady("包子",new Dog("小黑","黑色"));
        System.out.println(lady);

        Animal cat = new Cat("小菊","blue");
        Lady lady2 = new Lady("丽丽",cat);
        System.out.println(lady2);
        cat.enjoy();

    }
}

//​   1）定义一个抽象类Animal，其中包括属性name，相关构造方法，抽象方法enjoy()表示动物高兴时动作。
abstract class Animal {
    String name;
    public Animal() {}

    public Animal(String name) {
        this.name = name;
    }

    public abstract void enjoy();
}

//​	2）定义Cat类继承于Animal类，其中包括属性eyesColor，相关构造方法，同时具体化父类中的抽象方法。

class Cat extends Animal {
    private String eyesColor;

    public Cat(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public Cat(String name, String eyesColor) {
        super(name);
        this.eyesColor = eyesColor;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }



    @Override
    public void enjoy() {
        System.out.println("高兴的跳来跳去");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", eyesColor='" + eyesColor + '\'' +
                '}';
    }
}

//3）定义Dog类继承于Animal类，其中包括属性furColor，相关构造方法，同时具体化父类中的抽象方法。

class Dog extends Animal{
    private String furColor;

    public Dog(String furColor) {
        this.furColor = furColor;
    }

    public Dog(String name, String furColor) {
        super(name);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public void enjoy() {
        System.out.println("狗开心的时候摇着尾巴");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", furColor='" + furColor + '\'' +
                '}';
    }
}

/*
4）定义Lady类，其中包括属性name,以及Animal 类型的属性pet表示女士所养的宠物，定义构造方法，
生成女士对象时初始化姓名和她所养的宠物。
定义一个方法：myPetEnjoy表示此女士的宠物在高兴时的动作。提示：对于此类的定义中需要使用到多态性。
 */

class Lady {
    private String name;
    private Animal pet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public Lady() {
    }

    public Lady(String name, Animal pet) {
        this.name = name;
        this.pet = pet;
    }
    //定义一个方法：myPetEnjoy表示此女士的宠物在高兴时的动作。提示：对于此类的定义中需要使用到多态性。
    public void myPetEnjoy(Animal pet) {
        if (pet instanceof Cat) {
            System.out.println("高兴的跳来跳去");
        } else if (pet instanceof Dog) {
            System.out.println("高兴的摇尾巴");
        } else {
            System.out.println("类型错误");
        }
    }

    @Override
    public String toString() {
        return "Lady{" +
                "name='" + name + '\'' +
                ", pet=" + pet +
                '}';
    }
}