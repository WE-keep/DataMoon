package javabasic.review.day13;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/20 15:38 星期四
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 按照指定时间格式输出
        Date date = new Date(System.currentTimeMillis());
        String s = simpleDateFormat.format(date);
        System.out.println(s);

        Date date1 = new Date();
        String now = simpleDateFormat.format(date1);
        System.out.println(now);
    }
}
