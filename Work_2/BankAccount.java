package Homework.Work_2;

public class BankAccount {
    String owner;
    int balance;

    //Конструктор
    BankAccount(String someOwner, int someBalance) {
        this.owner = someOwner;
        this.balance = someBalance;
    }
    //Геттеры
    String getOwner() {
        return this.owner;
    }
    int getBalance() {
        return this.balance;
    }
    //Сеттер для владельца
    void setOwner(String newOwner) {
        this.owner = newOwner;
    }
    //Методы
    void deposit(int amount) {
        balance += amount;
        System.out.println("Внесли: " + amount);
    }
    void withdraw(int amount) {
        balance -= amount;
        System.out.println("Сняли: " + amount);
    }
    void print() {
        System.out.println("Баланс: " + balance);
    }
}
