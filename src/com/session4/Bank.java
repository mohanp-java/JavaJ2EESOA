package com.session4;

//An interface can extend multiple interfaces
public interface Bank extends Inter2, Inter1 {
    int a = 10, b = 20;
    void withdraw(double amount);
    void deposit(double amount);
}
