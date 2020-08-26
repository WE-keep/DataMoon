package javabasic.test.test823.seventh.pojo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/23 11:10 星期日
 */
public class Machine {
    private static HashMap<Integer, Goods> goodsList = new HashMap<>();
    private HashMap<Integer, Goods> shopCar = new HashMap<>();

    public static HashMap<Integer, Goods> getGoodsList() {
        return goodsList;
    }

    public static void setGoodsList(HashMap<Integer, Goods> goodsList) {
        Machine.goodsList = goodsList;
    }

    public Machine() {
    }

    public Machine(HashMap<Integer, Goods> hashMap) {
        this.goodsList = hashMap;
    }

    public HashMap<Integer, Goods> getHashMap() {
        return goodsList;
    }

    public void setHashMap(HashMap<Integer, Goods> hashMap) {
        this.goodsList = hashMap;
    }

    public void show() {
        String a = "多易校内超市自动购物机";
        String b = "国家863软件园多易大厦3层";
        String c = "机器编码：8-01";
        String d = "故障维修";
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d);

        Scanner scanner = new Scanner(System.in);
        System.out.println("请问是否购物：购物(y)" + "\n 提示：按输入其他自动退出");

        String s = scanner.next();
        if (s.toUpperCase().equals("Y")) {
            showGoodsList();
        } else {
            return;
        }
    }

    public void showGoodsList() {
        if (goodsList.size() == 0 || goodsList == null) {
            System.out.println("商品为空");
            return;
        } else {
            Set<Integer> set = goodsList.keySet();
            for (Integer integer : set) {
                Goods goods = goodsList.get(integer);
                System.out.println(goods.toString());
            }
        }
        System.out.println("请输入你要购买商品的商品号,如果要结账，请输入(pay)");
        Scanner scanner = new Scanner(System.in);


        A:
        while (true) {
            String s = scanner.next();
            if (s.equals("pay")) {
                pay();
                break A;
            }
            Integer i = Integer.parseInt(s);

            addToShopCar(i);
        }
    }

    public void addToShopCar(int goodsId) {

        Goods goods = goodsList.get(goodsId);
        if (goods.getNum() == 1) {
            goodsList.remove(goodsId);
        } else {
            int num = goods.getNum();
            goods.setNum(num - 1);
        }
        shopCar.put(goodsId, new Goods(goodsId, goods.getName(), 1, goods.getPrice()));

    }

    public void pay() {
        System.out.println("\t账单\t");
        Set<Map.Entry<Integer, Goods>> entries = shopCar.entrySet();
        for (Map.Entry<Integer, Goods> entry : entries) {
            Goods goods = entry.getValue();
            System.out.println(goods);
        }
        double money = 0;
        Set<Integer> set = shopCar.keySet();
        for (Integer integer : set) {
            int num = shopCar.get(integer).getNum();
            double price = shopCar.get(integer).getPrice();
            money += num * price;
        }
        System.out.println("你需要支付：" + money + "元钱");
    }
}
