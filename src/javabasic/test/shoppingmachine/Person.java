package javabasic.test.shoppingmachine;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/6 21:01 星期四
 */
public class Person {
    private String name;
    private int id;
    private String sex;
    private int age;
    private Goods[] goods;

    public Person() {
    }

    public Person(String name, int id, String sex, int age, Goods[] goods) {
        this.name = name;
        this.id = id;
        this.sex = sex;
        this.age = age;
        this.goods = goods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Goods[] getGoods() {
        return goods;
    }

    public void setGoods(Goods[] goods) {
        this.goods = goods;
    }
}
