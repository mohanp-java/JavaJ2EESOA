package com.session4;

public class CitiBankImpl implements Bank {
    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawing the amount in CitiBank : " + amount);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Depositing the amount in CitiBank : " + amount);
    }

    public static void main(String[] args) {
        AxisBankImpl axisBank = new AxisBankImpl();
        System.out.println(Bank.a);
        axisBank.withdraw(3434.45);
        axisBank.deposit(5646456.45);
        CitiBankImpl citiBank = new CitiBankImpl();
        System.out.println(citiBank.b);
        citiBank.withdraw(786678.56);
        citiBank.deposit(987897.45);
    }
}
