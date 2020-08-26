package javabasic.review.day13;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/20 15:53 星期四
 */
public class SimpleDateFormatTest {
    public static void main(String[] args) {
        //练习:  把字符串   "2018-11-25 11:11:11"  转成   "11:11:11 11/25/2018" 的字符串
        String s = "2018-11-25 11:11:11";

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("HH:mm:ss yyyy/MM/DD");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    }
}
