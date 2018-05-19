package com.techjava.springbootkafkaproducerdemo.model;

public class Account {

    private String accountName;
    private String accountNo;

    public Account(String accountName, String accountNo) {
        this.accountName = accountName;
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", accountNo='" + accountNo + '\'' +
                '}';
    }
}
