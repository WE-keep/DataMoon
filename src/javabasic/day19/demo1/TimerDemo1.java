package javabasic.day19.demo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/19 10:19 星期三
 */
public class TimerDemo1 {
    public static void main(String[] args) throws ParseException {

        String s = "20200819 10:27:50";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
        Date date = simpleDateFormat.parse(s);
        Timer timer = new Timer();

        /*timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("sleep");
            }
        },date);*/

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("ing");
            }
        },2000,2000);
    }
}
