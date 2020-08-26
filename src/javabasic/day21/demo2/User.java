package javabasic.day21.demo2;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/22 9:39 星期六
 */
public class User implements UserInteface{
    @Override
    public void login() {
        System.out.println("long sucessfull");
    }

    @Override
    public void register() {
        System.out.println("register sucessfull");
    }
}
