package javabasic.day21.demo1;

public class SalesPerson implements SuperMark{

    @Override
    public void sell() {
        System.out.println("打折活动开始");
        new MaoTai().sell();
        System.out.println("售后小礼物");
    }
}
