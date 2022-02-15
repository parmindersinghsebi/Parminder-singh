package com.Sebi;

public class account {
    private String name;
    private int accountNo;
    private String password;
    private int dob;
    private int balance;

    public account(String name, int accountNo, String password, int dob, int balance) {
        this.name = name;
        this.accountNo = accountNo;
        this.password = password;
        this.dob = dob;
        this.balance = balance;
    }
    public account() {
    }


    public String getName(){

        return name;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public String getPassword() {
        return password;
    }

    public int getDob() {
        return dob;
    }

    public int getBalance() {
        return balance;
    }

    public void checkbalance(int AccountNo, String password){
        if(this.accountNo==AccountNo&&this.password.equals(password)){
        System.out.println(this.name+" Your Account Balance is = "+balance);}
        else{
            System.out.println("Invalid Account Number or Password");
        }
    }
    public void depositmoney(int Money){
        this.balance=Money+balance;
        System.out.println("Money has been deposit successfully. Your new Balance is "+this.balance);
    }


    public void debitmoney(int Money){
        if(Money>this.balance){
            System.out.println("Balance has not enough.");
        }
        else{
            this.balance=balance-Money;
            System.out.println("Money has Debited. Your new Balance is "+this.balance);
        }
    }

}

