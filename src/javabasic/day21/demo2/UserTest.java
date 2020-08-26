package javabasic.day21.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/22 9:40 星期六
 */
public class UserTest {
    public static void main(String[] args) {
        User user = new User();


        Object o = Proxy.newProxyInstance(UserTest.class.getClassLoader(), User.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("login")) {
                    System.out.println("login before");
                    method.invoke(user, args);
                    System.out.println("login after");
                } else {
                    method.invoke(user,args);
                }
                return null;
            }
        });

        Object o2 = Proxy.newProxyInstance(UserTest.class.getClassLoader(), User.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("login")) {
                    System.out.println("你好，注册服务开始");
                    method.invoke(user, args);
                    System.out.println("Finish");
                } else {
                    method.invoke(user, args);
                }
                return null;
            }
        });

        UserInteface o1 = (UserInteface) o;
        o1.login();
        o1.register();
        System.out.println("------------------");
        UserInteface o3 = (UserInteface) o2;
        o3.login();
        o3.register();
    }
}
