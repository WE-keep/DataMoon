package javabasic.day21.demo1;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/22 9:07 星期六
 */

public class Demo1 {
    public static void main(String[] args) {
        /*
        代理模式：
            设计模式中遵循一个原理，对修改关闭，对扩展开放
            静态代理：
                1.必须要有接口
                2.需要有实体类实现接口，并实现里面的功能方法

                要在代理类的成员位置上创建被代理对象
                代理类徐亚奥自己手动实现
            动态代理：
         */

        MaoTai maoTai = new MaoTai();
        maoTai.sell();

        SalesPerson salesPerson = new SalesPerson();
        salesPerson.sell();
    }
}
