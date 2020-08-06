package javabasic.test.test1;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/6 10:53 星期四
 */
class Stud {
    static double sum = 0;
    static int num = 0;
    private int no;
    private String name;
    private double deg;

    public Stud() {
    }

    public Stud(int no, String name, double deg) {
        this.no = no;
        this.name = name;
        this.deg = deg;
        sum += deg;
        num++;
    }



    public int getNo() {
        return no;

    }

    public void setNo(int no) {
        this.no = no;
        num++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDeg() {
        return deg;
    }

    public void setDeg(double deg) {
        this.deg = deg;
        sum += deg;
    }

    public static double avg() {
        return sum / num;
    }
}
