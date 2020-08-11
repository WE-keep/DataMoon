package javabasic.day13.demo2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/10 15:06 星期一
 */
public class Demo7 {
    static Pattern pattern = Pattern.compile("\\b[a-zA-Z]{3}\\b");
    public static void main(String[] args) {
        String str = "jin tian yao xia xue, da jia bu yao chu qu";
        Matcher matcher = pattern.matcher(str);

        //find查找是否还有下一个符合规则的单侧
        //group如果find判断成功 那就判断成功 那就把符合规则的字符串取出来
        while (matcher.find()) {
            String s = matcher.group();
            System.out.println(s);
        }

    }
}
