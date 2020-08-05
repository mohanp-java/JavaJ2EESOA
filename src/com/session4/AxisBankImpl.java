package com.session4;

public class AxisBankImpl implements Bank{
    @Override
    public void withdraw(double amount) {
        AccessModifierDemo.b = 20;
        System.out.println(AccessModifierDemo.someName);
        System.out.println("Withdrawing the amount from axis bank : " + amount);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Depositing the amount from axis bank : " + amount);
    }

}
