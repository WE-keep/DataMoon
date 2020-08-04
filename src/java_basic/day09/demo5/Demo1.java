package java_basic.day09.demo5;
/*
组合关系：人（姓名、性别、身高、年龄、手机）
继承关系：
 */
public class Demo1 {
    public static void main(String[] args) {
        Person person = new Person("曹操",45,"男",new Phone("mi","redmi","red","34555"));
        System.out.println(person);
    }
}

class Person {
    private String name;
    private int age;
    private String sex;
    private Phone phone;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", phone=" + phone +
                '}';
    }

    public Person(String name, int age, String sex, Phone phone) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
    }

    public Person() {
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}

class Phone {
    private String brand;
    private String type;
    private String color;
    private String price;

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public Phone(String brand, String type, String color, String price) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
    }

    public Phone() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
