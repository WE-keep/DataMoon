package javabasic.day13.demo1;

import java.util.Date;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/10 8:52 星期一
 */
public class Demo1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        /*
        Date:日期和时间
            public Date()
            public Date(long time)

            public long getTime()
            public void setTime()

         */
        Date date = new Date();
        System.out.println(date);
        // Mon Aug 10 09:42:34 CST 2020

        Date date1 = new Date(19998877897678L);
        System.out.println(date1);
        // Wed Sep 28 19:51:37 CST 2603

        System.out.println(date.getTime());

        date.setTime(346456547568L);
        System.out.println(date);

    }
}

