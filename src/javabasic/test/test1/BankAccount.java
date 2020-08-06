package javabasic.test.test1;

import java.util.Random;

/**
 * @Author W.E9999@outlook.com
 * @Date 2020/8/6 11:02 星期四
 */
public class BankAccount {
    private int bankAccountId;
    private String date;
    private double money = 0;
    private double rest = 0;


    Random random = new Random();
    public BankAccount() {
    }

    public BankAccount(String date, double money) {
        this.bankAccountId = random.nextInt(100000);
        this.date = date;
        this.money = money;
        this.rest = money;
    }

    public int getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId() {
        this.bankAccountId = random.nextInt(100000);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getRest() {
        return rest;
    }

    public void setRest(double rest) {
        this.rest = rest;
    }

    public void bankIn(double money) {
        this.rest += money;
    }

    public void bankOut(double money) {
        this.rest -= money;
    }

    public void group() {
        System.out.println("账号:" + this.bankAccountId);
        System.out.println("余额:" + this.rest);
    }
}
