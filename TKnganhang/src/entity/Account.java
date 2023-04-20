package entity;

import service.IAccount;

public class Account implements IAccount {
    private String name;
    private String accountNumber;
    private String email;
    private double accountBalance;

    public Account(String name, String accountNumber, String email, double accountBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.email = email;
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "\n Tên: " + name +
                "\n Số tài khoản: " + accountNumber +
                "\n Email: " + email +
                "\n Số dư tài khoản: " + accountBalance;

    }

    @Override
    public void recharge(double amount) {
        this.accountBalance += amount;
    }

    @Override
    public void changeEmail(String email) {
        this.email = email;
    }

    @Override
    public void displayInfor() {
        System.out.println(toString());
    }
}
