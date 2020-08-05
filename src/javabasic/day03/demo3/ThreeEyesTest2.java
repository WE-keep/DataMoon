package javabasic.day03.demo3;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5
 */
public class ThreeEyesTest2 {
    public static void main(String[ ]args){
        int a = 12;
        int b = 44;

        String c = a==b?"相等":"不相等";
        System.out.println(c);

        int d = 19;
        String re = d%2==0?"true":"false";
        //boolean re = c%2==0?true:false;
        System.out.println(re);//false
    }
}
