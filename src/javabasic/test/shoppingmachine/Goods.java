package javabasic.test.shoppingmachine;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/6 20:06 星期四
 */
public class Goods {
    private String name;
    private long goodsId;
    private double price;
    private int nums;

    public Goods(String name, long goodsId, double price, int nums) {
        this.name = name;
        this.goodsId = goodsId;
        this.price = price;
        this.nums = nums;
    }

    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
