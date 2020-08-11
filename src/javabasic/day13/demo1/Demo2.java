package javabasic.day13.demo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/10 9:49 星期一
 */
public class Demo2 {
    public static void main(String[] args) throws ParseException {
        /*
        SimpleDateFormat:对日期进行格式化   格式可以自定义
            SimpleDateFormat()
            SimpleDateFormat()

            public Date parse(String DateStr)
         */
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");

        System.out.println(date);
        String s = simpleDateFormat.format(date);

        System.out.println(s);
        //2020-08-10 10:08:59
        System.out.println("----");
        String  birth = "1700-01-12 12:00:00";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");

        Date d2 = sdf.parse(birth);

        long time = d2.getTime();
        long time1 = date.getTime();
        long time2 = System.currentTimeMillis();
        System.out.println("time" + time);
        System.out.println("time2" + time2);

        System.out.println((time2 - time) / 1000 / 60 /60 /24);



    }
}
