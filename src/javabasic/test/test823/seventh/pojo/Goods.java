package javabasic.test.test823.seventh.pojo;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/23 11:09 星期日
 */
public class Goods {
    private int goodId;
    private String name;
    private int num;
    private double price;

    @Override
    public String toString() {
        return "goodId: " + goodId +
                "\t name " + name +
                "\t num " + num +
                "\t price" + price;
    }

    public Goods() {
    }

    public Goods(int goodId, String name, int num, double price) {
        this.goodId = goodId;
        this.name = name;
        this.num = num;
        this.price = price;
    }

    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
