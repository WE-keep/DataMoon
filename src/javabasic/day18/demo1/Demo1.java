package javabasic.day18.demo1;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/17 10:09 星期一
 */
public class Demo1 {
    public static void main(String[] args) throws IOException, ParseException {
        Properties properties = new Properties();
        properties.load(Demo1.class.getClassLoader().getResourceAsStream("config.properties"));

        String date = properties.getProperty("date");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
        Date time = simpleDateFormat.parse(date);
        System.out.println(time);
    }
}
