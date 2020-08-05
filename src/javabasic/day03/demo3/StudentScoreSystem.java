package javabasic.day03.demo3;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5
 */
public class StudentScoreSystem {
    public static void main(String[] args){
        int score = 88;
        String level = score>=90?"A":score>=80?"B":score>=70?"C":score>=60?"D":"E";
        System.out.println(level);

    }
}
