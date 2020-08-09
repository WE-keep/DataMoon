package javabasic.day11.demo1;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/7 11:58 星期五
 */


public class Person implements Cloneable{
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("caocao",12);
        System.out.println(person);
        //javabasic.day11.demo1.Person@1540e19d
        Object clone = person.clone();
        /*
        clone是直接在内存中复制一份出来给接收的对象
        Object.clone() 只能在自己定义的类中使用，且需要抛出异常CloneNotSupportedException
         */
        System.out.println(clone);
        //javabasic.day11.demo1.Person@677327b6
        System.out.println(person.equals(clone));
        //false
        System.out.println(person.getClass());
        //class javabasic.day11.demo1.Person
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
