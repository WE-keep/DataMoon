package javabasic.test.shoppingmachine;

import java.util.Scanner;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/6 20:50 星期四
 */
public class Machine {
    private Goods[] goods;
    private Goods[] shopCar;
    String a = "******************************";
    String b = "***********多易购物机***********";
    String c = "********机器编号：B-01**********";
    String d = "*****故障报修：010-88888888*****";
    String e = "*******************************";


    public void show() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请问是否购物：是(1)");
        int input = scanner.nextInt();
        if (input == 1) {
            menu();
        } else {
            show();
        }
    }

    public void menu() {
        System.out.println("1.查看商品");
        System.out.println("2.查看购物车");
        System.out.println("3.结算");
        System.out.println("4.修改欢迎界面");
        System.out.println("5.返回欢迎界面");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你选择的操作(对应的数字)");
        int input = scanner.nextInt();
        switch (input) {
            case 1:{
                viewProduct();
                break;
            }
            case 2:{
                checkShopCar();
                break;
            }
            case 3:{
                settlement();
                break;
            }
            case 4:{
                modify();
                break;
            }
            case 5:{
                show();
                break;
            }
            default:{
                break;
            }
        }
    }


    public void viewProduct() {
        int len = goods.length;
        for (int i = 0; i < len; i++) {
            System.out.println("商品名" + "\t" + "数量");
            System.out.println(goods[i].getName() + "\t" + goods[i].getNums());
        }
    }
    /**
     * 查看购物车
     */
    public void checkShopCar() {
        int len = shopCar.length;
        for (int i = 0; i < len; i++) {
            System.out.println("商品名" + "\t" + "数量");
            System.out.println(goods[i].getName() + "\t" + goods[i].getNums());
        }
    }

    /**
     * 结算
     */
    public void settlement() {
        double money = 0;
        int len = shopCar.length;
        for (int i = 0; i < len; i++) {
            money = shopCar[i].getPrice() * shopCar[i].getNums();
        }
        System.out.println("结算后总共花费:" + money);
    }

    public void modify() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请问你要修改哪行(请输入行号)");
        int input = scanner.nextInt();
        System.out.println("请输入你想输入的文字");
        String newLine = scanner.nextLine();
        switch (input) {
            case 1:{
                a = newLine;
                break;
            }
            case 2:{
                b = newLine;
                break;
            }
            case 3:{
                c = newLine;
                break;
            }
            case 4:{
                d = newLine;
                break;
            }
            case 5:{
                e = newLine;
                break;
            }
            default:{
                modify();
                break;
            }
        }
    }

    /**
     * 进货
     * 先判断原来基础上有没有，有的话就在基础上num相加，，没有的话就直接加入shopCar
     */
    public void purchase() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入商品对应的:产品名");
        String goodsName = scanner.nextLine();

        System.out.println("请输入产品ID");
        long goodsId = scanner.nextInt();

        System.out.println("请输入产品价格");
        double goodsPrice = scanner.nextDouble();

        System.out.println("请输入产品数量");
        int goodsNum = scanner.nextInt();

        while (true) {
            int i = 0;
            int len = goods.length;
            for (int j = 0; j < len; j++) {
                if (goods[j].getGoodsId() == goodsId) {
                    int oldNum = goods[j].getNums();
                    goods[j].setNums(oldNum + goodsNum);
                    System.out.println("是否继续进货");
                    String isGo = scanner.nextLine();
                    if ("是".equals(isGo)) {
                        purchase();
                    } else {
                        break;
                    }
                }
            }
            Goods newGoods = new Goods(goodsName,goodsId,goodsPrice,goodsNum);
            goods[len] = newGoods;
            String isGo = scanner.nextLine();
            if ("是".equals(isGo)) {
                purchase();
            } else {
                break;
            }
        }
    }

    /**
     * 加入购物车
     */
    public void addToShopCar() {

    }
}
