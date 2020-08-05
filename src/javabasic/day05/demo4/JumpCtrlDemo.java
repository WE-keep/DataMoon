package javabasic.day05.demo4;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/5 11:43 星期三
 */
public class JumpCtrlDemo {
    public static void main(String[] args) {
        for(int i=0;i<10;i++) {
            if(i == 3) {
                //break;// 结束单层循环
                //continue;//结束本次循环
                return;
            }
            System.out.println(i);
        }
        System.out.println("over");
    }
}
