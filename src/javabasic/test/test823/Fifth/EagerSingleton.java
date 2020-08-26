package javabasic.test.test823.Fifth;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/23 10:08 星期日
 */
public class EagerSingleton {
    private static EagerSingleton newInstance = null;

    public EagerSingleton() {}

    public synchronized static EagerSingleton getNewInstance() {
        if (newInstance == null) {
            newInstance = new EagerSingleton();
        }
        return newInstance;
    }
}
