package javabasic.test.test1;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/6 10:29 星期四
 */
public class Test3 {
    public static void main(String[] args) {
        Stud caoco = new Stud(1, "caoco", 99.0);
        Stud liubei = new Stud(2, "刘备", 101.0);
        Stud guanyu = new Stud(3, "guanyu", 100.0);

        Stud[] studsArr = {caoco,liubei,guanyu};

        System.out.println(Stud.avg());
    }
}
