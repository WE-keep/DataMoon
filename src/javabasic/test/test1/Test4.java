package javabasic.test.test1;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/6 11:01 星期四
 */
public class Test4 {
    public static void main(String[] args) {
        /**
         * 4. 设计一个BankAccount类，实现银行某账号的资金往来账目管理，
         * 包括建账号、存入、取出等。BankAccount类包括，账号（BankAccountId）、
         * 开户日期Date(日期)，Money(金额)，Rest(余额)。
         * 另有一个构造函数和三个成员函数Bankin()(处理存入账)，
         * Bankout()处理取出账)和和一个负责生成账号的自动增长的函数。
         */
        BankAccount b1 = new BankAccount("2020/8/6/11:12", 1000.0);
        b1.group();
        b1.bankIn(100.0);
        b1.group();
        b1.bankOut(200.0);
        b1.group();



        System.out.println();
    }
}
